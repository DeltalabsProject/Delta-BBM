package id.delta.bbm.utils.dialog;

import android.app.Activity;
import android.content.SharedPreferences;

import com.bbm.Alaska;
import com.bbm.a.a.a;

import id.delta.bbm.ui.dialog.andyxialm.PromptDialog;
import id.delta.bbm.utils.preference.PreferenceKeys;
import id.delta.bbm.utils.preference.PreferenceUtils;
import id.delta.bbm.utils.theme.ColorManager;

/**
 * Created by DELTALABS on 12/17/16.
 */

public class DialogUtils {

    private DialogUtils (){}

    public static void showDialogReset(final Activity activity) {
        new PromptDialog(activity)
                .setAnimationEnable(true)
                .setTitleText("WARNING!!!")
                .setContentText(PreferenceUtils.getString("reset_content"))
                .setPositiveListener(PreferenceUtils.getString("reset_ok"), new PromptDialog.OnPositiveListener() {
                    @Override
                    public void onClick(PromptDialog dialog) {
                        PreferenceUtils.clear();
                        PreferenceUtils.restartApp();
                    }
                }).show();
    }

    public static void showDialogAbout(final Activity activity) {
        new PromptDialog(activity)
                .setAnimationEnable(true)
                .setTitleText(PreferenceUtils.getString("versi"))
                .setContentText(a.c("QkJNIE1PRCBieSBZb3lvY3ggUyBQcmFkaXR5YSBQdXRyYQoKd3d3LmRlbHRhY29tcHV0aW5kby5jb20KREVMVEFMQUJTIC0gQDIwMTY="))
                .setPositiveListener("VISIT MY BLOG", new PromptDialog.OnPositiveListener() {
                    @Override
                    public void onClick(PromptDialog dialog) {
                        PreferenceUtils.startBrowserIntent(PreferenceKeys.STR_URL_BLOG, activity);
                        dialog.dismiss();
                    }
                }).show();
    }

    public static void showDialogMain(final Activity activity){
        if(PreferenceUtils.getBoolean(PreferenceKeys.KEY_DIALOG_MAIN, true)){
            new PromptDialog(activity)
                    .setAnimationEnable(true)
                    .setTitleText(a.c("UEVSSEFUSUFOISEh"))
                    .setContentText(a.c("VGVyaW1ha2FzaWggc3VkYWggbWVuZ2d1bmFrYW4gQkJNIERFTFRBLiAKCkRhcGF0a2FuIHNlbGFsdSB1cGRhdGUgdGVyYmFydSBkZW5nYW4gYmVyZ2FidW5nIGRpIGNoYW5uZWwgREVMVEFMQUJTLg=="))
                    .setPositiveListener("OK", new PromptDialog.OnPositiveListener() {
                        @Override
                        public void onClick(PromptDialog dialog) {
                            PreferenceUtils.startBrowserIntent(PreferenceKeys.STR_URL_CHANNEL, activity);
                            PreferenceUtils.putBoolean(PreferenceKeys.KEY_DIALOG_MAIN, false);
                            dialog.dismiss();
                        }
                    }).show();
        }
    }

    public static void showDialogSettings(final Activity activity){
        if(PreferenceUtils.getBoolean(PreferenceKeys.KEY_DIALOG_SETTINGS, true)){
            new PromptDialog(activity)
                    .setAnimationEnable(true)
                    .setTitleText(a.c("UEVSSEFUSUFOISEh"))
                    .setContentText(a.c("QkJNIE1vZCBvbGVoIFlveW9jeCBTIFByYWRpdHlhIFB1dHJhLgoKQkJNIGluaSBkaWRvd25sb2FkIEdSQVRJUyBoYW55YSBkaSB3d3cuZGVsdGFjb21wdXRpbmRvLmNvbS4KCkppa2EgQW5kYSBtZW5kYXBhdGthbiBCQk0gaW5pIGRlbmdhbiBjYXJhIG1lbWJlbGkgYmVyYXJ0aSBzZWxhbWF0IEFuZGEgVEVSVElQVS4KVGVyaW1ha2FzaWggc3VkYWggbWVuZ2d1bmFrYW4gQkJNIE1vZCBpbmkuCgpERUxUQUxBQlMgLSBAMjAxNg=="))
                    .setPositiveListener("OK", new PromptDialog.OnPositiveListener() {
                        @Override
                        public void onClick(PromptDialog dialog) {
                            PreferenceUtils.putBoolean(PreferenceKeys.KEY_DIALOG_SETTINGS, false);
                            dialog.dismiss();
                        }
                    }).show();
        }
    }
}
