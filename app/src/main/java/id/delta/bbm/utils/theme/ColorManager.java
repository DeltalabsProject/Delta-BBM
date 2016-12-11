package id.delta.bbm.utils.theme;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;

import com.bbm.Alaska;

import id.delta.bbm.utils.preference.PreferenceKeys;
import id.delta.bbm.utils.preference.PreferenceUtils;

/**
 * Created by DELTALABS on 12/11/16.
 */

public class ColorManager {

    private ColorManager(){}

    //Warna text tema terang
    public static int warnaPrimerHitam = 0xff000000;
    public static int warnaSecondHitam = 0xff707070;

    //Warna text tema gelap
    public static int warnaPrimerPutih = 0xffffffff;
    public static int warnaSecondPutih = 0xffd2d2d2;

    public static int warnaStatus = 0x80ffffff;

    // Warna aplikasi
    private static int warnaDefaultPrimer = 0xff0092cc;
    private static int warnaDefaultAksen = 0xff006064;

    public static int setWarnaPrimer(){
        return PreferenceUtils.getInt(PreferenceKeys.KEY_PRIMER, warnaDefaultPrimer);
    }

    public static int setWarnaAksen(){
        return PreferenceUtils.getInt(PreferenceKeys.KEY_ACCENT, warnaDefaultAksen);
    }

}
