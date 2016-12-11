package id.delta.bbm.activities.tab;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.bbm.bali.ui.main.fragment.FragmentChat;

import id.delta.bbm.fragment.FragmentTheme;

/**
 * Created by DELTALABS on 12/11/16.
 */

public class SettingsAdapter extends FragmentStatePagerAdapter {

    public SettingsAdapter(FragmentManager fragmentManager){
        super(fragmentManager);
    }

    @Override
    public Fragment getItem(int position) {
        Fragment fragment = null;
        switch (position){
            case 0:
                fragment=new FragmentTheme();
                break;
            case 1:
                fragment=new FragmentTheme();
                break;
            case 2:
                fragment=new FragmentTheme();
                break;
        }

        return fragment;
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        String title=" ";
        switch (position){
            case 0:
                title="THEME";
                break;
            case 1:
                title="COLOR";
                break;
            case 2:
                title="ABOUT";
                break;
        }

        return title;
    }
}
