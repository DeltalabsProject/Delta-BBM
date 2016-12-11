package id.delta.bbm.ui.text;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;

import id.delta.bbm.utils.text.TextUtils;

/**
 * Created by DELTALABS on 12/11/16.
 */

public class PrimerTextView extends TextView {
    public PrimerTextView(Context context) {
        super(context);
        initText();
    }

    public PrimerTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        initText();
    }

    public PrimerTextView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initText();
    }

    private void initText(){
        setTextSize(TextUtils.setUkuranTextView());
        setTypeface(null, TextUtils.setTypeFaceRead());
        setTextColor(TextUtils.setPrimerTextColor());
    }
}
