package id.delta.bbm.utils.preference;

import android.app.Activity;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Point;
import android.net.Uri;
import android.preference.PreferenceManager;
import android.view.WindowManager;

import com.bbm.Alaska;

/**
 * Created by DELTALABS on 12/11/16.
 */

public class PreferenceUtils {

    private PreferenceUtils (){}

    public static String PathData;

    static {
        PathData = getString("packageName")+"_preferences";
    }

    public static int getID(String nama, String type) {
        return Alaska.ctx.getResources().getIdentifier(nama, type, Alaska.ctx.getPackageName());
    }

    public static String getString(String string) {
        return Alaska.ctx.getString(Alaska.ctx.getResources().getIdentifier(string, "string", Alaska.ctx.getPackageName()));
    }

    public static void startBrowserIntent(final String baseUrl, Activity activity) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(baseUrl));
        activity.startActivity(browserIntent);
    }

    public static void restartApp() {
        Class class_;
        AlarmManager alarmManager = (AlarmManager)Alaska.ctx.getSystemService(Context.ALARM_SERVICE);
        long l = System.currentTimeMillis() + (long)500;
        try {
            class_ = Class.forName((String)"com.bbm.ui.activities.MainActivity");
        }
        catch (ClassNotFoundException var4_5) {
            NoClassDefFoundError noClassDefFoundError = new NoClassDefFoundError(var4_5.getMessage());
            throw noClassDefFoundError;
        }
        Intent intent = new Intent(Alaska.ctx, class_);
        alarmManager.set(1, l, PendingIntent.getActivity((Context)Alaska.ctx, (int)0, (Intent)intent, (int)0));
        System.exit((int)2);
    }

    public static SharedPreferences getPreferences() {
        return PreferenceManager.getDefaultSharedPreferences(Alaska.ctx);
    }

    public static boolean getBoolean(String key, boolean defaultValue) {
        return getPreferences().getBoolean(key, defaultValue);
    }

    public static int getInt(String key, int defaultValue) {
        return getPreferences().getInt(key, defaultValue);
    }

    public static String getString(String key, String defaultValue) {
        return getPreferences().getString(key, defaultValue);
    }

    public static SharedPreferences.Editor getEditor() {
        return getPreferences().edit();
    }

    public static void putBoolean(String key, boolean value) {
        getEditor().putBoolean(key, value).apply();
    }

    public static void putString(String key, String value) {
        getEditor().putString(key, value).apply();
    }

    public static void putInt(String key, int value) {
        getEditor().putInt(key, value).apply();
    }

    public static void remove(String key) {
        getEditor().remove(key).apply();
    }

    public static void clear() {
        getEditor().clear().commit();
    }


}
