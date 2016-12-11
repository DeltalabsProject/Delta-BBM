package id.delta.bbm.utils.preference;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.preference.PreferenceManager;

import com.bbm.Alaska;

/**
 * Created by DELTALABS on 12/11/16.
 */

public class PreferenceUtils {

    private PreferenceUtils (){}

    public static String PathData;

    static {
        PathData = getString("packageName")+"_preferences";
    }

    public static int getID(String nama, String type) {
        return Alaska.ctx.getResources().getIdentifier(nama, type, Alaska.ctx.getPackageName());
    }

    public static String getString(String string) {
        return Alaska.ctx.getString(Alaska.ctx.getResources().getIdentifier(string, "string", Alaska.ctx.getPackageName()));
    }

    public static void startBrowserIntent(final String baseUrl) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(baseUrl));
        Alaska.ctx.startActivity(browserIntent);
    }

    public static SharedPreferences getPreferences() {
        return PreferenceManager.getDefaultSharedPreferences(Alaska.ctx);
    }

    public static boolean getBoolean(String key, boolean defaultValue) {
        return getPreferences().getBoolean(key, defaultValue);
    }

    public static int getInt(String key, int defaultValue) {
        return getPreferences().getInt(key, defaultValue);
    }

}
