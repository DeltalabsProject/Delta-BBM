package id.delta.bbm.utils.lock;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

import id.delta.bbm.activities.LockActivity;
import id.delta.bbm.utils.preference.PreferenceKeys;
import id.delta.bbm.utils.preference.PreferenceUtils;

/**
 * Created by DELTALABS on 12/19/16.
 */

public class ViewLocker extends View {
    PreferenceUtils preferenceUtils;

    public ViewLocker(Context context) {
        super(context);
        initView(context);
    }

    public ViewLocker(Context context, AttributeSet attrs) {
        super(context, attrs);
        initView(context);
    }

    public ViewLocker(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initView(context);
    }

    private void initView(Context context){
        preferenceUtils =new PreferenceUtils(context);
        if (preferenceUtils.getSharedBoolean(PreferenceKeys.KEY_VIEWLOCKER)){
            preferenceUtils.startNewActivity(LockActivity.class);
            preferenceUtils.startService(LockService.class);
        }
    }
}
