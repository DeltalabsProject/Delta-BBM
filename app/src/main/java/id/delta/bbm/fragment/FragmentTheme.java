package id.delta.bbm.fragment;

import android.content.ContextWrapper;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.Preference;

import com.bbm.Alaska;

import id.delta.bbm.bahasa.Bahasa;
import id.delta.bbm.base.PreferenceFragment;
import id.delta.bbm.utils.dialog.DialogUtils;
import id.delta.bbm.utils.preference.PreferenceKeys;
import id.delta.bbm.utils.preference.PreferenceUtils;

/**
 * Created by DELTALABS on 12/11/16.
 */

public class FragmentTheme extends PreferenceFragment implements Preference.OnPreferenceClickListener, SharedPreferences.OnSharedPreferenceChangeListener{
    ContextWrapper contextWrapper;

    @Override
    public void onCreate(Bundle paramBundle) {
        super.onCreate(paramBundle);
        addPreferencesFromResource(PreferenceUtils.getID("delta_main_theme", "xml"));
        setContent();
    }

    private void setContent(){
        Preference preference = findPreference(PreferenceKeys.KEY_RESET);
        preference.setOnPreferenceClickListener(this);
        preference = findPreference(PreferenceKeys.KEY_RESTART);
        preference.setOnPreferenceClickListener(this);
    }

    @Override
    public void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String key) {
        switch (key){
            case PreferenceKeys.KEY_THEME:
                getActivity().recreate();
            case PreferenceKeys.KEY_PRIMER:
                getActivity().recreate();
            case PreferenceKeys.KEY_ACCENT:
                getActivity().recreate();
        }
    }

    @Override
    public boolean onPreferenceClick(Preference preference) {
        if (preference.getKey().equals(PreferenceKeys.KEY_RESET)) {
            DialogUtils.showDialogReset(getActivity());
        }

        if (preference.getKey().equals(PreferenceKeys.KEY_RESTART)) {
            PreferenceUtils.restartApp();
        }

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

    @Override
    public void onPause() {
        Bahasa.setLanguage(contextWrapper, PreferenceUtils.getString(PreferenceKeys.KEY_BAHASA, ""), true);
        super.onPause();
    }
}
