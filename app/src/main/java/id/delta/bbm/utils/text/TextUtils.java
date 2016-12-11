package id.delta.bbm.utils.text;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Typeface;
import android.preference.PreferenceManager;
import android.widget.TextView;

import com.bbm.Alaska;

import id.delta.bbm.utils.preference.PreferenceKeys;
import id.delta.bbm.utils.preference.PreferenceUtils;
import id.delta.bbm.utils.theme.ColorManager;

/**
 * Created by DELTALABS on 12/11/16.
 */

public class TextUtils {

    private TextUtils(){}

    public static int setUkuranTextView(){
        //Get int from EditTextPreference
        int n = Integer.parseInt((String) PreferenceUtils.getString(PreferenceKeys.KEY_UKURANTEXT, "14"));
        return n;
    }
    public static int setUkuranDateView (){
        return setUkuranTextView() - 2;
    }

    public static void setRunningText (TextView textView){
        textView.setSelected(true);
        textView.setSingleLine(true);
        textView.setEllipsize(android.text.TextUtils.TruncateAt.MARQUEE);
        textView.setMarqueeRepeatLimit(10000000);
        textView.setHorizontallyScrolling(true);
    }
    public static void setRunningTextChat(Context context, TextView textView){
        if(PreferenceUtils.getBoolean(PreferenceKeys.KEY_CHKTEXTCOLOR, false)){
            setRunningText(textView);
        }
    }
    public static void setRunningTextPM(Context context, TextView textView){
        if(PreferenceUtils.getBoolean(PreferenceKeys.KEY_CHKTEXTCOLOR, false)){
            setRunningText(textView);
        }
    }



    public static int setTypeFaceRead() {
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(Alaska.ctx);
        int n = Integer.parseInt((String) preferences.getString(PreferenceKeys.KEY_TYPERFACE, PreferenceKeys.DEFAULT_TYPERFACE));

        if (n == 0){
            return Typeface.NORMAL;
        }
        if (n == 1){
            return Typeface.ITALIC;
        }
        if (n == 2) {
            return Typeface.BOLD;
        }
        if (n == 3) {
            return Typeface.BOLD_ITALIC;
        }

        return n;
    }

    public static int setTypeFaceUnread() {
        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(Alaska.ctx);
        int n = Integer.parseInt((String) preferences.getString(PreferenceKeys.KEY_TYPERFACE, PreferenceKeys.DEFAULT_TYPERFACE));

        if (n == 0){
            return Typeface.BOLD;
        }
        if (n == 1){
            return Typeface.BOLD_ITALIC;
        }
        if (n == 2) {
            return Typeface.BOLD;
        }
        if (n == 3) {
            return Typeface.BOLD_ITALIC;
        }

        return n;
    }



    public static int setWarnaStatus(){
        if(PreferenceUtils.getBoolean(PreferenceKeys.KEY_CHKTEXTCOLOR, false)){
            return PreferenceUtils.getInt(PreferenceKeys.KEY_STATUSTEXT, ColorManager.warnaStatus);
        }else {
            return ColorManager.warnaStatus;
        }
    }

    //Text General
    public static int setGeneralHitam(){
        if(PreferenceUtils.getBoolean(PreferenceKeys.KEY_CHKTEXTCOLOR, false)){
            return PreferenceUtils.getInt(PreferenceKeys.KEY_GENERALTEXT, ColorManager.warnaPrimerHitam);
        }else {
            return ColorManager.warnaPrimerHitam;
        }
    }
    public static int setGeneralPutih(){
        if(PreferenceUtils.getBoolean(PreferenceKeys.KEY_CHKTEXTCOLOR, false)){
            return PreferenceUtils.getInt(PreferenceKeys.KEY_GENERALTEXT, ColorManager.warnaPrimerPutih);
        }else {
            return ColorManager.warnaPrimerPutih;
        }
    }

    // Text Primer
    public static int setPrimerHitam(){
        if(PreferenceUtils.getBoolean(PreferenceKeys.KEY_CHKTEXTCOLOR, false)){
            return PreferenceUtils.getInt(PreferenceKeys.KEY_PRIMERTEXT, ColorManager.warnaPrimerHitam);
        }else {
            return ColorManager.warnaPrimerHitam;
        }
    }
    public static int setPrimerPutih(){
        if(PreferenceUtils.getBoolean(PreferenceKeys.KEY_CHKTEXTCOLOR, false)){
            return PreferenceUtils.getInt(PreferenceKeys.KEY_PRIMERTEXT, ColorManager.warnaPrimerPutih);
        }else {
            return ColorManager.warnaPrimerPutih;
        }
    }

    // Text Sekunder
    public static int setSecondHitam(){
        if(PreferenceUtils.getBoolean(PreferenceKeys.KEY_CHKTEXTCOLOR, false)){
            return PreferenceUtils.getInt(PreferenceKeys.KEY_SECUNDERTEXT, ColorManager.warnaSecondHitam);
        }else {
            return ColorManager.warnaSecondHitam;
        }
    }
    public static int setSecondPutih(){
        if(PreferenceUtils.getBoolean(PreferenceKeys.KEY_CHKTEXTCOLOR, false)){
            return PreferenceUtils.getInt(PreferenceKeys.KEY_SECUNDERTEXT, ColorManager.warnaSecondPutih);
        }else {
            return ColorManager.warnaSecondPutih;
        }
    }

    // Text Tanggal
    public static int setTanggalHitam(){
        if(PreferenceUtils.getBoolean(PreferenceKeys.KEY_CHKTEXTCOLOR, false)){
            return PreferenceUtils.getInt(PreferenceKeys.KEY_DATETEXT, ColorManager.warnaSecondHitam);
        }else {
            return ColorManager.warnaSecondHitam;
        }
    }
    public static int setTanggalPutih(){
        if(PreferenceUtils.getBoolean(PreferenceKeys.KEY_CHKTEXTCOLOR, false)){
            return PreferenceUtils.getInt(PreferenceKeys.KEY_DATETEXT, ColorManager.warnaSecondPutih);
        }else {
            return ColorManager.warnaSecondPutih;
        }
    }

    public static int setDateTextColor (){
        int n = Integer.parseInt((String) PreferenceUtils.getString(PreferenceKeys.KEY_THEME, PreferenceKeys.DEFAULT_THEME));

        if (n == 0){
            return setTanggalHitam();
        }
        if (n == 1){
            return setTanggalPutih();
        }
        if (n == 2){
            return setTanggalPutih();
        }
        if (n == 3){
            return setTanggalPutih();
        }
        if (n == 4){
            return setTanggalPutih();
        }
        if (n == 5){
            return setTanggalPutih();
        }

        return n;
    }

    public static int setSecondTextColor (){
        int n = Integer.parseInt((String) PreferenceUtils.getString(PreferenceKeys.KEY_THEME, PreferenceKeys.DEFAULT_THEME));

        if (n == 0){
            return setSecondHitam();
        }
        if (n == 1){
            return setSecondPutih();
        }
        if (n == 2){
            return setSecondPutih();
        }
        if (n == 3){
            return setSecondPutih();
        }
        if (n == 4){
            return setSecondPutih();
        }
        if (n == 5){
            return setSecondPutih();
        }

        return n;
    }

    public static int setPrimerTextColor (){
        int n = Integer.parseInt((String) PreferenceUtils.getString(PreferenceKeys.KEY_THEME, PreferenceKeys.DEFAULT_THEME));

        if (n == 0){
            return setPrimerHitam();
        }
        if (n == 1){
            return setPrimerPutih();
        }
        if (n == 2){
            return setPrimerPutih();
        }
        if (n == 3){
            return setPrimerPutih();
        }
        if (n == 4){
            return setPrimerPutih();
        }
        if (n == 5){
            return setPrimerPutih();
        }

        return n;
    }

}
