package id.delta.bbm.ui.primer;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;

import id.delta.bbm.utils.theme.ColorManager;
import id.delta.bbm.utils.theme.ThemeManager;

/**
 * Created by DELTALABS on 12/17/16.
 */

public class PrimaryLinearLayout extends LinearLayout {
    public PrimaryLinearLayout(Context context) {
        super(context);
        initVew();
    }

    public PrimaryLinearLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
        initVew();
    }

    public PrimaryLinearLayout(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initVew();
    }

    private void initVew(){
        setBackgroundColor(ColorManager.setWarnaPrimer());
    }
}
