package id.delta.bbm.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;

import com.bbm.bali.ui.main.a.e;
import com.bbm.ui.activities.MainActivity;

import id.delta.bbm.utils.dialog.DialogUtils;
import id.delta.bbm.utils.preference.PreferenceKeys;
import id.delta.bbm.utils.preference.PreferenceUtils;
import id.delta.bbm.utils.theme.ColorManager;
import id.delta.bbm.utils.view.ViewUtils;

/**
 * Created by DELTALABS on 12/9/16.
 */

public class SettingsActivity extends e {
    private static final String TAG_NESTED = "TAG_NESTED";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(ViewUtils.setLayoutSettings());
        DialogUtils.showDialogSettings(this);
        viewToolbar();

        if(PreferenceUtils.getBoolean(PreferenceKeys.KEY_LAY_SETTINGS, true)){
            viewWithTab();
        }else {
            if (savedInstanceState == null) {
                getFragmentManager().beginTransaction()
                        .add(PreferenceUtils.getID("content_frame","id"), new SettingsFragment())
                        .commit();
            }
        }

    }

    private void viewToolbar(){
        Toolbar toolbar = (Toolbar)findViewById(PreferenceUtils.getID("toolbar","id"));
        setSupportActionBar(toolbar);
        toolbar.setBackgroundColor(ColorManager.setWarnaPrimer());
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
    }

    private void viewWithTab(){
        //ViewPager
        ViewPager mPager = (ViewPager) findViewById(PreferenceUtils.getID("pager","id"));
        mPager.setAdapter(new SettingsAdapter(getSupportFragmentManager()));
        mPager.setOffscreenPageLimit(8);

        //TabLayout
        TabLayout tabs = (TabLayout) findViewById(PreferenceUtils.getID("tabs","id"));
        tabs.setupWithViewPager(mPager);
        tabs.setSelectedTabIndicatorColor(ColorManager.warnaStatus);

        //Coloring with Key
        LinearLayout linearLayout = (LinearLayout)findViewById(PreferenceUtils.getID("linearlayout","id"));
        linearLayout.setBackgroundColor(ColorManager.setWarnaPrimer());

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(PreferenceUtils.getID("delta_menu_settings", "menu"), menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == PreferenceUtils.getID("about", "id")) {
            DialogUtils.showDialogAbout(this);
            return true;
        } else if (item.getItemId() == PreferenceUtils.getID("report", "id")) {
            deltaReport();
            return true;
        } else if (item.getItemId() == PreferenceUtils.getID("share", "id")) {
            deltaShare();
            return true;
        }else if (item.getItemId() == PreferenceUtils.getID("reset", "id")) {
            DialogUtils.showDialogReset(this);
            return true;
        }else if (item.getItemId() == PreferenceUtils.getID("restart", "id")) {
            PreferenceUtils.restartApp();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    private void deltaReport() {
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType("message/rfc822");
        intent.putExtra("android.intent.extra.EMAIL", new String[]{"deltalabsmod@gmail.com"});
        intent.putExtra("android.intent.extra.SUBJECT", PreferenceUtils.getString("versi"));
        intent.putExtra("android.intent.extra.TEXT", PreferenceUtils.getString(PreferenceKeys.KEY_PROBLEMS,null));
        this.startActivity(Intent.createChooser((Intent) intent, (CharSequence) "Report..."));

    }

    private void deltaShare() {
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType("text/plain");
        intent.putExtra("android.intent.extra.SUBJECT", "DELTA BBM ");
        intent.putExtra("android.intent.extra.TEXT", "Saya menggunakan DELTA BBM, BBM Mod penuh dengan berbagai fitur. Coba Sekarang!!! Download di http://www.deltacomputindo.com");
        startActivity(Intent.createChooser((Intent) intent, (CharSequence) "Delta BBM Share App!"));
    }

    @Override
    public void onBackPressed() {
        startActivity(new Intent(this, MainActivity.class));
        this.finish();
    }
}
