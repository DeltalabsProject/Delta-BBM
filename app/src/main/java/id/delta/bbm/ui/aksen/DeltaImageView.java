package id.delta.bbm.ui.aksen;

import android.content.Context;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.widget.ImageView;

import id.delta.bbm.utils.theme.ColorManager;

/**
 * Created by DELTALABS on 12/11/16.
 */

public class DeltaImageView extends ImageView {
    public DeltaImageView(Context context) {
        super(context);
        setImageColor();
    }

    public DeltaImageView(Context context, AttributeSet attrs) {
        super(context, attrs);
        setImageColor();
    }

    public DeltaImageView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        setImageColor();
    }

    private void setImageColor(){
        this.setColorFilter(ColorManager.setWarnaAksen(), PorterDuff.Mode.SRC_ATOP);
    }
}
