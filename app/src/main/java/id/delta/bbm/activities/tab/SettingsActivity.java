package id.delta.bbm.activities.tab;

import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.Toolbar;
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
        mPager.setOffscreenPageLimit(3);

        //TabLayout
        TabLayout tabs = (TabLayout) findViewById(PreferenceUtils.getID("tabs","id"));
        tabs.setupWithViewPager(mPager);
        //   tabs.setSelectedTabIndicatorColor(PreferenceUtils.setWarnaAksen(this));

        //Coloring with Key
        LinearLayout linearLayout = (LinearLayout)findViewById(R.id.linearlayout);
        linearLayout.setBackgroundColor(ColorManager.setWarnaPrimer());

        //Coloring StatusBar Lolipop Up
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            Window window = this.getWindow();
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.setStatusBarColor(ColorManager.setWarnaPrimer());
        }
    }
}
