package com.bbm.ui.activities;

import android.content.Intent;
import android.support.design.widget.NavigationView;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.LinearLayout;

import com.bbm.bali.ui.main.a.e;
import com.bbm.bali.ui.main.fragment.MainAdapter;

import id.delta.bbm.R;
import id.delta.bbm.activities.SettingsActivity;
import id.delta.bbm.utils.dialog.DialogUtils;
import id.delta.bbm.utils.preference.PreferenceUtils;
import id.delta.bbm.utils.theme.ColorManager;


public class MainActivity extends e implements NavigationView.OnNavigationItemSelectedListener{
    private DrawerLayout mDrawer;
    private ViewPager mPager;
    private TabLayout mTab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setupView();
        DialogUtils.showDialogMain(this);
    }

    private void setupView(){
        final Toolbar toolbar = (Toolbar) findViewById(R.id.appbar_toolbar);
        setSupportActionBar(toolbar);
        toolbar.setTitle(R.string.app_name);
        toolbar.setNavigationIcon(R.drawable.ic_menu);

        mDrawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        mDrawer.setDrawerListener(new ActionBarDrawerToggle(this, mDrawer, toolbar, R.string.drawer_open, R.string.drawer_close));

        final NavigationView navView = (NavigationView) findViewById(R.id.navigation_view);
        navView.setNavigationItemSelectedListener(this);

        LinearLayout linearLayout = (LinearLayout)findViewById(PreferenceUtils.getID("linearlayout","id"));
        linearLayout.setBackgroundColor(ColorManager.setWarnaPrimer());

        mPager = (ViewPager)findViewById(R.id.pager);
        mPager.setAdapter(new MainAdapter(getSupportFragmentManager()));
        mTab = (TabLayout)findViewById(R.id.tabs);
        mTab.setupWithViewPager(mPager);
    }

    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        mDrawer.closeDrawers();
        final int mItemId = item.getItemId();
        mDrawer.postDelayed(new Runnable() {
            @Override
            public void run() {
                switch (mItemId) {
                    case R.id.nav_invite:
                        break;
                    case R.id.nav_channel:
                        break;
                    case R.id.nav_scan:
                        break;
                    case R.id.nav_profil:
                        break;
                    case R.id.nav_settings:
                        startActivity(new Intent(MainActivity.this, SettingsActivity.class));
                        MainActivity.this.finish();
                        break;
                    case R.id.nav_deltachannel:
                        DialogUtils.showDialogAbout(MainActivity.this);
                        break;
                }
            }
        }, 75);
        return true;
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            startActivity(new Intent(this, SettingsActivity.class));
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
