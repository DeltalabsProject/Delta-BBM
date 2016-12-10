package com.bbm.bali.ui.main.fragment;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by DELTALABS on 12/9/16.
 */

public class MainAdapter extends FragmentStatePagerAdapter {

    public MainAdapter(FragmentManager fragmentManager){
        super(fragmentManager);
    }

    @Override
    public Fragment getItem(int position) {
        Fragment fragment = null;
        switch (position){
            case 0:
                fragment=new FragmentChat();
                break;
            case 1:
                fragment=new FragmentBlog();
                break;
            case 2:
                fragment=new FragmentBlog();
                break;
            case 3:
                fragment=new FragmentBlog();
                break;
            case 4:
                fragment=new FragmentBlog();
                break;
        }

        return fragment;
    }

    @Override
    public int getCount() {
        return 5;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        String title=" ";
        switch (position){
            case 0:
                title="Chats";
                break;
            case 1:
                title="Feeds";
                break;
            case 2:
                title="People";
                break;
            case 3:
                title="Group";
                break;
            case 4:
                title="Discvr";
                break;
        }

        return title;
    }
}
