package id.delta.bbm.utils.lock;

import android.app.ActivityManager;
import android.app.Service;
import android.content.Context;
import android.content.Intent;

import com.bbm.Alaska;

import id.delta.bbm.activities.LockActivity;
import id.delta.bbm.utils.preference.PreferenceKeys;
import id.delta.bbm.utils.preference.PreferenceUtils;

/**
 * Created by DELTALABS on 12/19/16.
 */

public class LockService extends DeltaService implements Timer.OnTimerEvent {

    private PreferenceUtils preferenceUtils;
    private Context context;
    private Timer timer = new Timer();
    private Intent intentService;
    private Intent intentActivity;


    @Override
    public void onServiceCreate(Context cont) {
        preferenceUtils = new PreferenceUtils(cont);
        context = cont;
        intentActivity = new Intent(cont, LockActivity.class);
        intentActivity.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        intentActivity.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);

    }

    @Override
    public void onStart(Intent intent, int flags, int startId) {
        intentService = intent;
        timer.SetOnTimerEvent("", 1000, this);
        timer.StartTimer();
    }

    @Override
    public void onServiceBind(Intent intent) {

    }

    @Override
    public void onTimer(String id) {
        Boolean fLock = preferenceUtils.getSharedBoolean(PreferenceKeys.KEY_VIEWLOCKER);
        if (fLock){
            ActivityManager activityManager = (ActivityManager)context.getSystemService(Context.ACTIVITY_SERVICE);
            String sysPackName = activityManager.getRunningTasks(1).get(0).topActivity.getPackageName().trim();
            String curPackName = getPackageName().trim();

            String sysActName = activityManager.getRunningTasks(1).get(0).topActivity.getClassName().trim();
            String curActName=getClass().getName().trim();

            if(sysPackName.equals(curPackName) && !sysActName.equals(curActName)){
                startActivity(intentActivity);
            }
        }else {
            this.stopService(intentService);
        }
    }
}
