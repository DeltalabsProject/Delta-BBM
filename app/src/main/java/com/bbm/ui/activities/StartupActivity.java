package com.bbm.ui.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import com.bbm.bali.ui.main.a.e;

import id.delta.bbm.R;
import id.delta.bbm.utils.preference.PreferenceUtils;
import id.delta.bbm.utils.theme.ColorManager;

/**
 * Created by DELTALABS on 12/9/16.
 */

public class StartupActivity extends e {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splashscreen);

        RelativeLayout relativeLayout = (RelativeLayout)findViewById(PreferenceUtils.getID("root_layout","id"));
        relativeLayout.setBackgroundColor(ColorManager.setWarnaPrimer());

        Thread timerThread = new Thread(){
            public void run(){
                try{
                    sleep(1500);
                }catch(InterruptedException e){
                    e.printStackTrace();
                }finally{
                    Intent intent = new Intent(StartupActivity.this,MainActivity.class);
                    startActivity(intent);
                }
            }
        };
        timerThread.start();
    }

    @Override
    protected void onPause() {
        super.onPause();
        finish();
    }
}
