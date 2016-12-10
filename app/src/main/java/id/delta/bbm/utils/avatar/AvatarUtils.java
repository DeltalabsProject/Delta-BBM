package id.delta.bbm.utils.avatar;

import android.content.SharedPreferences;
import android.graphics.Color;
import android.preference.PreferenceManager;
import com.bbm.Alaska;
import id.delta.bbm.utils.preference.PreferenceKeys;

/**
 * Created by DELTALABS on 12/9/16.
 */
public class AvatarUtils {

    private AvatarUtils(){}

    public static int setWarnaBorder (){
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(Alaska.ctx);
        return preferences.getInt(PreferenceKeys.KEY_BORDER, Color.WHITE);
    }

    public static int setWarnaShadow (){
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(Alaska.ctx);
        return preferences.getInt(PreferenceKeys.KEY_SHADOW, Color.BLACK);
    }

    public static int getShadowRadius() {
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(Alaska.ctx);
        return preferences.getInt(PreferenceKeys.KEY_SHADOWWIDTH, 2);
    }

    public static int getBorderRadius() {
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(Alaska.ctx);
        return preferences.getInt(PreferenceKeys.KEY_BORDERWIDTH, 2);
    }


}
