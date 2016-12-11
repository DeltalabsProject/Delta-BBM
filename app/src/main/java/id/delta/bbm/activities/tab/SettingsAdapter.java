package id.delta.bbm.activities.tab;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.bbm.bali.ui.main.fragment.FragmentChat;

import id.delta.bbm.fragment.FragmentAvatar;
import id.delta.bbm.fragment.FragmentMain;
import id.delta.bbm.fragment.FragmentMessage;
import id.delta.bbm.fragment.FragmentNotification;
import id.delta.bbm.fragment.FragmentOther;
import id.delta.bbm.fragment.FragmentPrivate;
import id.delta.bbm.fragment.FragmentText;
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
                fragment=new FragmentText();
                break;
            case 2:
                fragment=new FragmentMain();
                break;
            case 3:
                fragment=new FragmentMessage();
                break;
            case 4:
                fragment=new FragmentAvatar();
                break;
            case 5:
                fragment=new FragmentNotification();
                break;
            case 6:
                fragment=new FragmentPrivate();
                break;
            case 7:
                fragment=new FragmentOther();
                break;
        }

        return fragment;
    }

    @Override
    public int getCount() {
        return 8;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        String title=" ";
        switch (position){
            case 0:
                title="THEME";
                break;
            case 1:
                title="TEXT";
                break;
            case 2:
                title="MAIN";
                break;
            case 3:
                title="MESSAGE";
                break;
            case 4:
                title="AVATAR";
                break;
            case 5:
                title="NOTIFICATION";
                break;
            case 6:
                title="PRIVATE";
                break;
            case 7:
                title="OTHER";
                break;
        }

        return title;
    }
}
