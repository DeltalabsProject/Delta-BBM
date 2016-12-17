package id.delta.bbm.utils.chat;

import id.delta.bbm.utils.preference.PreferenceKeys;
import id.delta.bbm.utils.preference.PreferenceUtils;

/**
 * Created by DELTALABS on 12/17/16.
 */

public class MessageUtils {

    private MessageUtils (){}

    public static int setBroadCastColor(){
        String lister = PreferenceUtils.getString(PreferenceKeys.KEY_BROADCASTCOLOR, "2");
        int n = Integer.parseInt(lister);

        if (n == 0) {
            return PreferenceUtils.getID("delta_black","color");
        }
        if (n == 1) {
            return PreferenceUtils.getID("delta_white", "color");
        }
        if (n == 2) {
            return PreferenceUtils.getID("delta_red","color");
        }
        if (n == 3) {
            return PreferenceUtils.getID("delta_pink", "color");
        }
        if (n == 4) {
            return PreferenceUtils.getID("delta_purple", "color");
        }
        if (n == 5) {
            return PreferenceUtils.getID("delta_deeppurple", "color");
        }
        if (n == 6) {
            return PreferenceUtils.getID("delta_indigo", "color");
        }
        if (n == 7) {
            return PreferenceUtils.getID("delta_blue", "color");
        }
        if (n == 8) {
            return PreferenceUtils.getID("delta_cyan", "color");
        }
        if (n == 9) {
            return PreferenceUtils.getID("delta_teal", "color");
        }
        if (n == 10) {
            return PreferenceUtils.getID("delta_green", "color");
        }
        if (n == 11) {
            return PreferenceUtils.getID("delta_lightgreen", "color");
        }
        if (n == 12) {
            return PreferenceUtils.getID("delta_lime", "color");
        }
        if (n == 13) {
            return PreferenceUtils.getID("delta_yellow", "color");
        }
        if (n == 14) {
            return PreferenceUtils.getID("delta_amber", "color");
        }
        if (n == 15) {
            return PreferenceUtils.getID("delta_orange", "color");
        }
        if (n == 16) {
            return PreferenceUtils.getID("delta_deeporange", "color");
        }
        if (n == 17) {
            return PreferenceUtils.getID("delta_brown", "color");
        }
        if (n == 18) {
            return PreferenceUtils.getID("delta_grey", "color");
        }
        if (n == 19) {
            return PreferenceUtils.getID("delta_bluegrey", "color");
        }
        return n;
    }

    public static int setIncomingColor(){
        int n = Integer.parseInt((String) PreferenceUtils.getString(PreferenceKeys.KEY_INCOMINGCOLOR, "0"));

        if (n == 0) {
            return PreferenceUtils.getID("delta_black","color");
        }
        if (n == 1) {
            return PreferenceUtils.getID("delta_white", "color");
        }
        if (n == 2) {
            return PreferenceUtils.getID("delta_red","color");
        }
        if (n == 3) {
            return PreferenceUtils.getID("delta_pink", "color");
        }
        if (n == 4) {
            return PreferenceUtils.getID("delta_purple", "color");
        }
        if (n == 5) {
            return PreferenceUtils.getID("delta_deeppurple", "color");
        }
        if (n == 6) {
            return PreferenceUtils.getID("delta_indigo", "color");
        }
        if (n == 7) {
            return PreferenceUtils.getID("delta_blue", "color");
        }
        if (n == 8) {
            return PreferenceUtils.getID("delta_cyan", "color");
        }
        if (n == 9) {
            return PreferenceUtils.getID("delta_teal", "color");
        }
        if (n == 10) {
            return PreferenceUtils.getID("delta_green", "color");
        }
        if (n == 11) {
            return PreferenceUtils.getID("delta_lightgreen", "color");
        }
        if (n == 12) {
            return PreferenceUtils.getID("delta_lime", "color");
        }
        if (n == 13) {
            return PreferenceUtils.getID("delta_yellow", "color");
        }
        if (n == 14) {
            return PreferenceUtils.getID("delta_amber", "color");
        }
        if (n == 15) {
            return PreferenceUtils.getID("delta_orange", "color");
        }
        if (n == 16) {
            return PreferenceUtils.getID("delta_deeporange", "color");
        }
        if (n == 17) {
            return PreferenceUtils.getID("delta_brown", "color");
        }
        if (n == 18) {
            return PreferenceUtils.getID("delta_grey", "color");
        }
        if (n == 19) {
            return PreferenceUtils.getID("delta_bluegrey", "color");
        }
        return n;
    }

    public static int setOutgoingColor(){
        int n = Integer.parseInt((String) PreferenceUtils.getString(PreferenceKeys.KEY_OUTGOINGCOLOR, "1"));

        if (n == 0) {
            return PreferenceUtils.getID("delta_black","color");
        }
        if (n == 1) {
            return PreferenceUtils.getID("delta_white", "color");
        }
        if (n == 2) {
            return PreferenceUtils.getID("delta_red","color");
        }
        if (n == 3) {
            return PreferenceUtils.getID("delta_pink", "color");
        }
        if (n == 4) {
            return PreferenceUtils.getID("delta_purple", "color");
        }
        if (n == 5) {
            return PreferenceUtils.getID("delta_deeppurple", "color");
        }
        if (n == 6) {
            return PreferenceUtils.getID("delta_indigo", "color");
        }
        if (n == 7) {
            return PreferenceUtils.getID("delta_blue", "color");
        }
        if (n == 8) {
            return PreferenceUtils.getID("delta_cyan", "color");
        }
        if (n == 9) {
            return PreferenceUtils.getID("delta_teal", "color");
        }
        if (n == 10) {
            return PreferenceUtils.getID("delta_green", "color");
        }
        if (n == 11) {
            return PreferenceUtils.getID("delta_lightgreen", "color");
        }
        if (n == 12) {
            return PreferenceUtils.getID("delta_lime", "color");
        }
        if (n == 13) {
            return PreferenceUtils.getID("delta_yellow", "color");
        }
        if (n == 14) {
            return PreferenceUtils.getID("delta_amber", "color");
        }
        if (n == 15) {
            return PreferenceUtils.getID("delta_orange", "color");
        }
        if (n == 16) {
            return PreferenceUtils.getID("delta_deeporange", "color");
        }
        if (n == 17) {
            return PreferenceUtils.getID("delta_brown", "color");
        }
        if (n == 18) {
            return PreferenceUtils.getID("delta_grey", "color");
        }
        if (n == 19) {
            return PreferenceUtils.getID("delta_bluegrey", "color");
        }
        return n;
    }

}
