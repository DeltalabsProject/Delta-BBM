package id.delta.bbm.fragment;

import android.os.Bundle;

import com.bbm.Alaska;

import id.delta.bbm.base.PreferenceFragment;
import id.delta.bbm.utils.preference.PreferenceUtils;

/**
 * Created by DELTALABS on 12/11/16.
 */

public class FragmentTheme extends PreferenceFragment {

    @Override
    public void onCreate(Bundle paramBundle) {
        super.onCreate(paramBundle);
        addPreferencesFromResource(PreferenceUtils.getID("delta_main_theme", "xml"));
    }
}
