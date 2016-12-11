package id.delta.bbm.bahasa;

import java.util.Locale;

/**
 * Created by DELTALABS on 12/11/16.
 */

public class ListBahasa {

    private static final String CHARSET_DEFAULT = "UTF-8";
    private static final String[] HUMAN_RAW = {
            null,
            "English (English)",
            "Indonesian (Bahasa Indonesia)",
            "Sundanese (Basa Sunda)",
            "Javanese (Boso Jowo)",
          //  "Buginese (Bugis)",
          //  "Batak Language (Batak)"

    };
    private static final String[] MACHINE = {
            "",
            "en",
            "in",
            "su",
            "jv",
         //   "bug",
         //   "btk"
    };

    private static String[] mHuman;

    public static String[] getHumanReadable() {
        if (mHuman == null) {
            mHuman = new String[HUMAN_RAW.length];

            mHuman[0] = getDefaultLabel();

            for (int i = 1; i < mHuman.length; i++) {
                try {
                    mHuman[i] = HUMAN_RAW[i];
                }
                catch (Exception e) {
                    mHuman[i] = MACHINE[i];
                }
            }
        }

        return mHuman;
    }

    public static String[] getMachineReadable() {
        return MACHINE;
    }

    private static String getDefaultLabel() {
        final String languageIso3 = Locale.getDefault().getISO3Language();

        if (languageIso3.equals("in")) return "Default (Bahasa Telepon)";
        else return "Default (Phone Language)";
    }
}
