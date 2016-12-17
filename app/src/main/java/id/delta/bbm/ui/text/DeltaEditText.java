package id.delta.bbm.ui.text;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.preference.PreferenceManager;
import android.util.AttributeSet;
import android.widget.EditText;

import id.delta.bbm.utils.chat.MessageUtils;
import id.delta.bbm.utils.preference.PreferenceKeys;
import id.delta.bbm.utils.preference.PreferenceUtils;
import id.delta.bbm.utils.text.TextUtils;
import id.delta.bbm.utils.theme.ColorManager;

/**
 * Created by DELTALABS on 12/11/16.
 */

public class DeltaEditText extends EditText {
    EditText rl;
    Resources res = getResources();

    public DeltaEditText(Context context) {
        super(context);
        initText();
    }

    public DeltaEditText(Context context, AttributeSet attrs) {
        super(context, attrs);
        initText();
    }

    public DeltaEditText(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initText();
    }

    private void initText(){
        setTextSize(TextUtils.setUkuranTextView());
        setTypeface(null, TextUtils.setTypeFaceRead());
        setTextColor(TextUtils.setEditTextColor());
        setHintTextColor(ColorManager.warnaStatus);

        if(getId() == PreferenceUtils.getID("message_input_text","id")){
            rl = (EditText) findViewById(PreferenceUtils.getID("message_input_text","id"));

        }
    }

}
