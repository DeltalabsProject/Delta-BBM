package id.delta.bbm.bahasa;

import android.content.ContextWrapper;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.preference.PreferenceManager;

import java.util.Locale;

/**
 * Created by DELTALABS on 12/11/16.
 */

// Original from https://github.com/delight-im/Android-Languages Edit by Dhian Rusdhiana

public class Bahasa {

    protected static Locale mOriginalLocale;

    static {
        mOriginalLocale = Locale.getDefault();
    }

    public static void init(final ContextWrapper context, final String langPrefName) {
        final SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(context);
        init(context, langPrefName, prefs);
    }

    public static void init(final ContextWrapper context, final String langPrefName, SharedPreferences prefs) {
        setLanguage(context, prefs.getString(langPrefName, ""));
    }

    public static void setLanguage(final ContextWrapper context, final String languageCode) {
        setLanguage(context, languageCode, false);
    }

    public static void setLanguage(final ContextWrapper context, final String languageCode, final boolean forceUpdate) {

        if (!languageCode.equals("") || forceUpdate) {
            try {

                final Locale newLocale;


                if (languageCode.equals("")) {

                    newLocale = mOriginalLocale;
                }

                else {

                    if (languageCode.contains("-r") || languageCode.contains("-")) {

                        final String[] language_region = languageCode.split("\\-(r)?");

                        newLocale = new Locale(language_region[0], language_region[1]);
                    }

                    else {

                        newLocale = new Locale(languageCode);
                    }
                }

                if (newLocale != null) {

                    final Resources resources = context.getBaseContext().getResources();
                    final android.content.res.Configuration conf = resources.getConfiguration();
                    conf.locale = newLocale;
                    resources.updateConfiguration(conf, resources.getDisplayMetrics());


                    Locale.setDefault(newLocale);
                }
            }
            catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static Locale getOriginalLocale() {
        return mOriginalLocale;
    }
}
