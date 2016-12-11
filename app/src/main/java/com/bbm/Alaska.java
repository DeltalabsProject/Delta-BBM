package com.bbm;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.multidex.MultiDexApplication;

import id.delta.bbm.bahasa.Bahasa;
import id.delta.bbm.utils.preference.PreferenceKeys;

/**
 * Created by DELTALABS on 12/9/16.
 */

public class Alaska extends MultiDexApplication {
    public static Context ctx;

    public Alaska()
    {
        ctx=getApplicationContext();
    }


    public final Context getApplicationContext()
    {
        return this;
    }

    @Override
    public void onCreate() {
        super.onCreate();

        new Runnable() {

            @Override
            public void run() {
                //Fitur Bahasa
                Bahasa.init(Alaska.this, PreferenceKeys.KEY_BAHASA);

                registerActivityLifecycleCallbacks(CALLBACKS);

            }
        }.run();
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        //Fitur Bahasa
        Bahasa.init(this, PreferenceKeys.KEY_BAHASA);
    }

    private static final ActivityLifecycleCallbacks CALLBACKS = new ActivityLifecycleCallbacks() {
        @Override
        public void onActivityCreated(Activity activity, Bundle savedInstanceState) {

        }
        @Override
        public void onActivityStarted(Activity activity) {}
        @Override
        public void onActivityResumed(Activity activity) {}
        @Override
        public void onActivityPaused(Activity activity) {}
        @Override
        public void onActivityStopped(Activity activity) {}
        @Override
        public void onActivitySaveInstanceState(Activity activity, Bundle outState) {}
        @Override
        public void onActivityDestroyed(Activity activity) {}
    };
}
