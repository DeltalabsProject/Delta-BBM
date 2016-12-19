package id.delta.bbm.activities;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.Snackbar;
import android.text.InputType;
import android.view.View;
import android.widget.EditText;

import com.bbm.bali.ui.main.a.e;

import id.delta.bbm.R;
import id.delta.bbm.utils.lock.LockService;
import id.delta.bbm.utils.lock.SlideButtonListener;
import id.delta.bbm.utils.lock.SlideUnlock;
import id.delta.bbm.utils.preference.PreferenceKeys;
import id.delta.bbm.utils.preference.PreferenceUtils;

/**
 * Created by DELTALABS on 12/19/16.
 */

public class LockActivity extends e{
    private PreferenceUtils preferenceUtils=new PreferenceUtils(this);
    EditText inputpassword;
    String passwd;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(PreferenceUtils.getID("delta_lock_activity", "layout"));
        viewContent();
    }

    private void viewContent(){
        passwd = PreferenceUtils.getString(PreferenceKeys.KEY_PASWORDLOCK, "");

        inputpassword = (EditText)findViewById(PreferenceUtils.getID("input_password","id"));
        inputpassword.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_VARIATION_PASSWORD);

        if(passwd.equals("")){
            inputpassword.setVisibility(View.GONE);
        }

        Boolean fLock=preferenceUtils.getSharedBoolean(PreferenceKeys.KEY_VIEWLOCKER);
        if (!fLock)
        {
            preferenceUtils.putBoolean(PreferenceKeys.KEY_VIEWLOCKER, true);
            preferenceUtils.startService(LockService.class);
        }

        ((SlideUnlock) findViewById(R.id.unlockButton)).setSlideButtonListener(new SlideButtonListener() {
            @Override
            public void handleSlide(View w) {
                gotoUnlock(w);
            }
        });

    }

    public void gotoUnlock(View view){

        if (inputpassword.getText().toString().equals(passwd)){
            preferenceUtils.putBoolean(PreferenceKeys.KEY_VIEWLOCKER, false);
            this.finish();
        }
        else{
            Snackbar.make(view, "Incorrect Password", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show();
        }
    }

    @Override
    public void onBackPressed() {
        this.moveTaskToBack(true);
    }
}
