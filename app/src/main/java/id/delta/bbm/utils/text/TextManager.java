package id.delta.bbm.utils.text;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;

import com.bbm.Alaska;

import id.delta.bbm.utils.preference.PreferenceKeys;
import id.delta.bbm.utils.preference.PreferenceUtils;
import id.delta.bbm.utils.theme.ColorManager;

/**
 * Created by DELTALABS on 12/11/16.
 */

public class TextManager {

    private TextManager(){}

    public static int setWarnaStatus(){
        if(PreferenceUtils.getBoolean(PreferenceKeys.KEY_CHKTEXTCOLOR, false)){
            return PreferenceUtils.getInt(PreferenceKeys.KEY_STATUSTEXT, ColorManager.warnaStatus);
        }else {
            return ColorManager.warnaStatus;
        }
    }
}
