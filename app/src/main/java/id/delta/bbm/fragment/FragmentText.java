package id.delta.bbm.fragment;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.Preference;

import id.delta.bbm.base.PreferenceFragment;
import id.delta.bbm.utils.preference.PreferenceKeys;
import id.delta.bbm.utils.preference.PreferenceUtils;

/**
 * Created by DELTALABS on 12/11/16.
 */

public class FragmentText extends PreferenceFragment implements Preference.OnPreferenceClickListener, SharedPreferences.OnSharedPreferenceChangeListener{

    @Override
    public void onCreate(Bundle paramBundle) {
        super.onCreate(paramBundle);
        addPreferencesFromResource(PreferenceUtils.getID("delta_main_text", "xml"));
    }

    @Override
    public void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String key) {
        switch (key){
            case PreferenceKeys.KEY_UKURANTEXT:
                getActivity().recreate();
            case PreferenceKeys.KEY_TYPERFACE:
                getActivity().recreate();
            case PreferenceKeys.KEY_CHKTEXTCOLOR:
                getActivity().recreate();
            case PreferenceKeys.KEY_PRIMERTEXT:
                getActivity().recreate();
            case PreferenceKeys.KEY_SECUNDERTEXT:
                getActivity().recreate();
        }
    }

    @Override
    public boolean onPreferenceClick(Preference preference) {
        return false;
    }

    @Override
    public void onResume() {
        super.onResume();
        getPreferenceScreen().getSharedPreferences().registerOnSharedPreferenceChangeListener(this);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        getPreferenceScreen().getSharedPreferences().unregisterOnSharedPreferenceChangeListener(this);
    }
}
