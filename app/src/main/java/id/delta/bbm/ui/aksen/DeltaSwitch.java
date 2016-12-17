package id.delta.bbm.ui.aksen;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.os.Build;
import android.support.v7.widget.SwitchCompat;
import android.util.AttributeSet;

import id.delta.bbm.utils.text.TextUtils;
import id.delta.bbm.utils.theme.ColorManager;

/**
 * Created by DELTALABS on 12/17/16.
 */

public class DeltaSwitch extends SwitchCompat {

    public DeltaSwitch(Context context,AttributeSet c) {
        super(context, c);
        setTintColor();

    }
    public DeltaSwitch(Context context) {
        super(context);
        setTintColor();
    }
    public DeltaSwitch(Context context,AttributeSet c,int i) {
        super(context, c, i);
        setTintColor();
    }


    @Override
    public void setChecked(boolean checked) {
        super.setChecked(checked);
        changeColor(checked);
    }

    private void changeColor(boolean isChecked) {
        if (Build.VERSION.SDK_INT >= 16) {
            int thumbColor;
            int trackColor;

            if(isChecked) {
                thumbColor = ColorManager.setWarnaAksen();
                trackColor = 80 * 0x01000000;
            } else {
                thumbColor = Color.argb(255, 236, 236, 236);
                trackColor = 0xff9e9e9e;
            }

            try {
                getThumbDrawable().setColorFilter(thumbColor, PorterDuff.Mode.MULTIPLY);
                getTrackDrawable().setColorFilter(trackColor+thumbColor, PorterDuff.Mode.MULTIPLY);

            }
            catch (NullPointerException e) {
                e.printStackTrace();
            }
        }
    }

    private void setTintColor(){
        setTextSize(TextUtils.setUkuranTextView());
        setTextColor(TextUtils.setGeneralTextColor());
        setTypeface(null, TextUtils.setTypeFaceRead());
        setChecked(isChecked());
    }
}
