package id.delta.bbm.ui.text;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;

import id.delta.bbm.utils.preference.PreferenceUtils;
import id.delta.bbm.utils.text.TextManager;
import id.delta.bbm.utils.theme.ColorManager;

/**
 * Created by DELTALABS on 12/11/16.
 */

public class DeltaTextView extends TextView {
    TextView tv;

    public DeltaTextView(Context context) {
        super(context);
    }

    public DeltaTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public DeltaTextView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    private void setInlineText(){
        if(getId() == PreferenceUtils.getID("item_username","id")){
            tv = (TextView) findViewById(PreferenceUtils.getID("item_username","id"));
            setTextColor(ColorManager.warnaPrimerPutih);
            setTextSize(18);
        }
        if(getId() == PreferenceUtils.getID("item_status","id")){
            tv = (TextView) findViewById(PreferenceUtils.getID("item_status","id"));
            setTextColor(ColorManager.warnaStatus);
        }
        if(getId() == PreferenceUtils.getID("profile_status_message","id")){
            tv = (TextView) findViewById(PreferenceUtils.getID("profile_status_message","id"));
            setTextColor(TextManager.setWarnaStatus());
        }


    }
}
