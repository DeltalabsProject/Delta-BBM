package com.bbm.bali.ui.main.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bbm.bali.ui.main.a.h;

import id.delta.bbm.R;

/**
 * Created by DELTALABS on 12/9/16.
 */

public class FragmentBlog extends h {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_blog,container,false);

    }



}
