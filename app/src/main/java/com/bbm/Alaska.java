package com.bbm;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.multidex.MultiDexApplication;

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

                registerActivityLifecycleCallbacks(CALLBACKS);

            }
        }.run();
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
