package com.bbm.a.a;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.util.Base64;

import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;

/**
 * Created by DELTALABS on 12/17/16.
 */
public class a {

    private a(){}

    public static String c(String encoded) {
        byte[] dataDec = Base64.decode(encoded, Base64.DEFAULT);
        String decodedString = "";
        try {

            decodedString = new String(dataDec, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();

        } finally {

            return decodedString;
        }
    }


}
