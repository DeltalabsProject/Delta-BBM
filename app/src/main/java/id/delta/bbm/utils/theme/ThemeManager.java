package id.delta.bbm.utils.theme;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Build;
import android.preference.PreferenceManager;

import com.bbm.Alaska;

import id.delta.bbm.utils.preference.PreferenceKeys;
import id.delta.bbm.utils.preference.PreferenceUtils;

/**
 * Created by DELTALABS on 12/9/16.
 */

public class ThemeManager {

    private ThemeManager(){}

    public static void setKonfigurasi (Activity activity){
        applyTheme(activity);
      //  setFullScreen(context, activity);
      //  setRotation(activity);
      //  TintManager.setTintManager(activity);
      //  WindowUtils.setWindowBackground(activity);
      //  WindowUtils.setActivityAnimation(activity);

        if (Build.VERSION.SDK_INT >= 21) {
            activity.getWindow().setStatusBarColor(Color.BLACK);
        }
    }

    public static int listTheme (){
        int n = Integer.parseInt((String) PreferenceUtils.getString(PreferenceKeys.KEY_THEME, PreferenceKeys.DEFAULT_THEME));
        if (n == 0) {
            return PreferenceUtils.getID("BBMAppTheme","style");
        }
        if (n == 1) {
            return PreferenceUtils.getID("Delta.Dark", "style");
        }
        if (n == 2) {
            return PreferenceUtils.getID("Delta.Dark.NonAmoled", "style");
        }
        if (n == 3) {
            return PreferenceUtils.getID("Delta.Transparent", "style");
        }
        if (n == 4) {
            return PreferenceUtils.getID("Delta.Black", "style");
        }
        if (n == 5) {
            return PreferenceUtils.getID("Delta.Sailfish", "style");
        }
        return n;
    }

    public static void applyTheme(Activity activity) {
        int themeId = listTheme();
        activity.setTheme(themeId);
    }


}
