package id.delta.bbm.utils.view;

import android.view.View;

import id.delta.bbm.utils.preference.PreferenceKeys;
import id.delta.bbm.utils.preference.PreferenceUtils;
import id.delta.bbm.utils.theme.ColorManager;

/**
 * Created by DELTALABS on 12/18/16.
 */

public class ViewUtils {

    private ViewUtils(){}

    public static int setLayoutSettings(){
        if(PreferenceUtils.getBoolean(PreferenceKeys.KEY_LAY_SETTINGS, true)){
            return PreferenceUtils.getID("delta_tabsettings_activity","layout");
        }else {
            return PreferenceUtils.getID("delta_settings_activity","layout");
        }
    }
}
