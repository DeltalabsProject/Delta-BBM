package id.delta.bbm.fragment;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.Preference;

import id.delta.bbm.base.PreferenceFragment;
import id.delta.bbm.utils.dialog.DialogUtils;
import id.delta.bbm.utils.preference.PreferenceKeys;
import id.delta.bbm.utils.preference.PreferenceUtils;

/**
 * Created by DELTALABS on 12/11/16.
 */

public class FragmentOther extends PreferenceFragment implements Preference.OnPreferenceClickListener, SharedPreferences.OnSharedPreferenceChangeListener{

    @Override
    public void onCreate(Bundle paramBundle) {
        super.onCreate(paramBundle);
        addPreferencesFromResource(PreferenceUtils.getID("delta_main_other", "xml"));
        setContent();
    }

    private void setContent(){
        Preference preference = findPreference(PreferenceKeys.KEY_RESET);
        preference.setOnPreferenceClickListener(this);
    }

    @Override
    public void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String key) {

    }

    @Override
    public boolean onPreferenceClick(Preference preference) {
        if (preference.getKey().equals(PreferenceKeys.KEY_RESET)) {
            DialogUtils.showDialogReset(getActivity());
        }
        return false;
    }
}
