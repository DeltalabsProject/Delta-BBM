package id.delta.bbm.activities.tab;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.graphics.ColorUtils;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.Window;
import android.view.WindowManager;
import android.widget.LinearLayout;

import com.bbm.bali.ui.main.a.e;

import id.delta.bbm.R;
import id.delta.bbm.utils.preference.PreferenceUtils;
import id.delta.bbm.utils.theme.ColorManager;

/**
 * Created by DELTALABS on 12/9/16.
 */

public class SettingsActivity extends e {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(PreferenceUtils.getID("delta_tabsettings_activity", "layout"));
        contentView();
    }

    private void contentView(){
        //Toolbar
        Toolbar toolbar = (Toolbar)findViewById(PreferenceUtils.getID("toolbar","id"));
        setSupportActionBar(toolbar);

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

        //Coloring StatusBar Lolipop Up
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            Window window = this.getWindow();
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.setStatusBarColor(ColorManager.setWarnaPrimer());
        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(PreferenceUtils.getID("delta_menu_settings", "menu"), menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == PreferenceUtils.getID("about", "id")) {
           // DialogUtils.showDialogAbout(this);
            return true;
        } else if (item.getItemId() == PreferenceUtils.getID("donate", "id")) {
           // DialogUtils.showDialogDonasi(this);
            return true;
        } else if (item.getItemId() == PreferenceUtils.getID("report", "id")) {
           // deltaReport();
            return true;
        } else if (item.getItemId() == PreferenceUtils.getID("share", "id")) {
           // deltaShare();
            return true;
        }else if (item.getItemId() == PreferenceUtils.getID("contributor", "id")) {
          //  startActivity(new Intent(SettingsActivity.this, ContributorActivity.class));
            return true;
        }else if (item.getItemId() == PreferenceUtils.getID("restart", "id")) {
            PreferenceUtils.restartApp();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
