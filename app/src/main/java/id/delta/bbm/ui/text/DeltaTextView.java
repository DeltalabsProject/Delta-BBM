package id.delta.bbm.ui.text;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;

import id.delta.bbm.utils.preference.PreferenceUtils;
import id.delta.bbm.utils.text.TextUtils;
import id.delta.bbm.utils.theme.ColorManager;

/**
 * Created by DELTALABS on 12/11/16.
 */

public class DeltaTextView extends TextView {
    TextView tv;

    public DeltaTextView(Context context) {
        super(context);
        initText();
    }

    public DeltaTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        initText();
    }

    public DeltaTextView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initText();
    }

    private void initText(){
        setInlineText();
        textTanggal();
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
            setTextColor(TextUtils.setWarnaStatus());
        }
        if(getId() == PreferenceUtils.getID("chat_message","id")){
            tv = (TextView) findViewById(PreferenceUtils.getID("chat_message","id"));
            setTextColor(TextUtils.setSecondTextColor());
            TextUtils.setRunningTextChat(this.getContext(), tv);
        }
    }

    private void textTanggal(){
        if(getId() == PreferenceUtils.getID("feeds_list_item_contacts_title_date","id")){
            tv = (TextView) findViewById(PreferenceUtils.getID("feeds_list_item_contacts_title_date","id"));
            tv.setTextColor(TextUtils.setDateTextColor());
            tv.setTextSize(TextUtils.setUkuranDateView());
        }

        if(getId() == PreferenceUtils.getID("date","id")){
            tv = (TextView) findViewById(PreferenceUtils.getID("date","id"));
            tv.setTextColor(TextUtils.setDateTextColor());
            tv.setTextSize(TextUtils.setUkuranDateView());
        }

        if(getId() == PreferenceUtils.getID("group_chat_date","id")){
            tv = (TextView) findViewById(PreferenceUtils.getID("group_chat_date","id"));
            tv.setTextColor(TextUtils.setDateTextColor());
            tv.setTextSize(TextUtils.setUkuranDateView());
        }

        if(getId() == PreferenceUtils.getID("current_category","id")){
            tv = (TextView) findViewById(PreferenceUtils.getID("current_category","id"));
            tv.setTextColor(TextUtils.setDateTextColor());
            tv.setTextSize(TextUtils.setUkuranDateView());
        }

        if(getId() == PreferenceUtils.getID("message_date","id")){
            tv = (TextView) findViewById(PreferenceUtils.getID("message_date","id"));
            tv.setTextColor(TextUtils.setDateTextColor());
            tv.setTextSize(TextUtils.setUkuranDateView());
        }

        if(getId() == PreferenceUtils.getID("chat_date","id")){
            tv = (TextView) findViewById(PreferenceUtils.getID("chat_date","id"));
            tv.setTextColor(TextUtils.setDateTextColor());
            tv.setTextSize(TextUtils.setUkuranDateView());
        }

        if(getId() == PreferenceUtils.getID("channel_report_pane_comment_time_stamp","id")){
            tv = (TextView) findViewById(PreferenceUtils.getID("channel_report_pane_comment_time_stamp","id"));
            tv.setTextColor(TextUtils.setDateTextColor());
            tv.setTextSize(TextUtils.setUkuranDateView());
        }
    }
}
