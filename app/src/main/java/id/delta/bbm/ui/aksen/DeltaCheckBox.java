package id.delta.bbm.ui.aksen;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.CheckBox;

import id.delta.bbm.utils.preference.PreferenceUtils;
import id.delta.bbm.utils.theme.ColorManager;

public class DeltaCheckBox extends CheckBox {
	public DeltaCheckBox(Context context) {
		super(context);
		setChecked(isChecked());
	}

	public DeltaCheckBox(Context context, AttributeSet attrs) {
		super(context, attrs);
		setChecked(isChecked());
	}

	public DeltaCheckBox(Context context, AttributeSet attrs, int defStyleAttr) {
		super(context, attrs, defStyleAttr);
		setChecked(isChecked());
	}

	@TargetApi(Build.VERSION_CODES.LOLLIPOP)
	public DeltaCheckBox(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
		super(context, attrs, defStyleAttr, defStyleRes);
		setChecked(isChecked());
	}

	@Override
	public void setChecked(boolean checked) {
		super.setChecked(checked);


		changeColor(checked);
	}

	private void changeColor(boolean isChecked) {
		if (Build.VERSION.SDK_INT >= 16) {
			Resources res = getResources();
            Drawable d = res.getDrawable(PreferenceUtils.getID("abc_btn_check_material","drawable"));
		 
			if(isChecked) {
				d.setColorFilter(ColorManager.setWarnaAksen(), PorterDuff.Mode.SRC_IN);
				
			} else {
				
				d.setColorFilter(0xff9e9e9e, PorterDuff.Mode.SRC_IN);
				
			}

			try {
				DeltaCheckBox.this.setButtonDrawable(d);

			}
			catch (NullPointerException e) {
				e.printStackTrace();
			}
		}
	}
}
