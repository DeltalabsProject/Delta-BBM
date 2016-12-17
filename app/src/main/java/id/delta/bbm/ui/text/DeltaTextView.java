package id.delta.bbm.ui.text;

import android.content.Context;
import android.graphics.Typeface;
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
        setTextSize(TextUtils.setUkuranTextView());
        setTypeface(null, TextUtils.setTypeFaceRead());
        setTextColor(TextUtils.setGeneralTextColor());

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
        if(getId() == PreferenceUtils.getID("profile_display_name","id")){
            tv = (TextView) findViewById(PreferenceUtils.getID("profile_display_name","id"));
            setTextColor(TextUtils.setWarnaNama());
            setTextSize(20);
            setTypeface(null, Typeface.BOLD);
        }

        if(getId() == PreferenceUtils.getID("group_name","id")){
            tv = (TextView) findViewById(PreferenceUtils.getID("group_name","id"));
            tv.setTextColor(ColorManager.warnaPrimerPutih);
        }

        if(getId() == PreferenceUtils.getID("actionbar_group_description","id")){
            tv = (TextView) findViewById(PreferenceUtils.getID("actionbar_group_description","id"));
            tv.setTextColor(ColorManager.warnaPrimerPutih);
        }

        if(getId() == PreferenceUtils.getID("actionbar_status_message","id")){
            tv = (TextView) findViewById(PreferenceUtils.getID("actionbar_status_message","id"));
            setTextColor(ColorManager.warnaPrimerPutih);
            TextUtils.setRunningTextPM(tv);
        }

        if(getId() == PreferenceUtils.getID("actionbar_group_name","id")){
            tv = (TextView) findViewById(PreferenceUtils.getID("actionbar_group_name","id"));
            setTextColor(ColorManager.warnaPrimerPutih);
        }
        if(getId() == PreferenceUtils.getID("actionbar_channel_name","id")){
            tv = (TextView) findViewById(PreferenceUtils.getID("actionbar_channel_name","id"));
            setTextColor(ColorManager.warnaPrimerPutih);
        }
        if(getId() == PreferenceUtils.getID("actionbar_channel_status","id")){
            tv = (TextView) findViewById(PreferenceUtils.getID("actionbar_channel_status","id"));
            setTextColor(ColorManager.warnaPrimerPutih);
        }

        if(getId() == PreferenceUtils.getID("contact_name_grid","id")){
            tv = (TextView) findViewById(PreferenceUtils.getID("contact_name_grid","id"));
            setTextColor(ColorManager.warnaPrimerPutih);
        }

        if(getId() == PreferenceUtils.getID("mpc_header_title","id")){
            tv = (TextView) findViewById(PreferenceUtils.getID("mpc_header_title","id"));
            setTextColor(ColorManager.warnaPrimerPutih);
        }

        // List Item Chat //
        if(getId() == PreferenceUtils.getID("chat_title","id")){
            tv = (TextView) findViewById(PreferenceUtils.getID("chat_title","id"));
            setTextColor(TextUtils.setPrimerTextColor());
        }
        if(getId() == PreferenceUtils.getID("chat_message","id")){
            tv = (TextView) findViewById(PreferenceUtils.getID("chat_message","id"));
            setTextColor(TextUtils.setSecondTextColor());
            TextUtils.setRunningTextChat(tv);
        }

        // List Item Contact //
        if(getId() == PreferenceUtils.getID("contact_name","id")){
            tv = (TextView) findViewById(PreferenceUtils.getID("contact_name","id"));
            setTextColor(TextUtils.setPrimerTextColor());
        }
        if(getId() == PreferenceUtils.getID("contact_message","id")){
            tv = (TextView) findViewById(PreferenceUtils.getID("contact_message","id"));
            setTextColor(TextUtils.setSecondTextColor());
        }

        // List Feed Title //
        if(getId() == PreferenceUtils.getID("feeds_list_item_contacts_title_title","id")){
            tv = (TextView) findViewById(PreferenceUtils.getID("feeds_list_item_contacts_title_title","id"));
            setTextColor(TextUtils.setPrimerTextColor());
        }
        if(getId() == PreferenceUtils.getID("feeds_list_item_contacts_pre_body_image_text","id")){
            tv = (TextView) findViewById(PreferenceUtils.getID("feeds_list_item_contacts_pre_body_image_text","id"));
            setTextColor(TextUtils.setSecondTextColor());
        }
        if(getId() == PreferenceUtils.getID("feeds_list_item_contacts_body_title","id")){
            tv = (TextView) findViewById(PreferenceUtils.getID("feeds_list_item_contacts_body_title","id"));
            setTextColor(TextUtils.setSecondTextColor());
        }
        if(getId() == PreferenceUtils.getID("feeds_list_item_contacts_body_message","id")){
            tv = (TextView) findViewById(PreferenceUtils.getID("feeds_list_item_contacts_body_message","id"));
            setTextColor(TextUtils.setSecondTextColor());
        }
        if(getId() == PreferenceUtils.getID("feeds_list_item_quote_text","id")){
            tv = (TextView) findViewById(PreferenceUtils.getID("feeds_list_item_quote_text","id"));
            setTextColor(TextUtils.setSecondTextColor());
        }

        // Komentar //
        if(getId() == PreferenceUtils.getID("channel_post_commentor_name","id")){
            tv = (TextView) findViewById(PreferenceUtils.getID("channel_post_commentor_name","id"));
            setTextColor(TextUtils.setPrimerTextColor());
        }
        if(getId() == PreferenceUtils.getID("channel_post_commentor_text","id")){
            tv = (TextView) findViewById(PreferenceUtils.getID("channel_post_commentor_text","id"));
            setTextColor(TextUtils.setSecondTextColor());
        }


        if(getId() == PreferenceUtils.getID("message_input_text","id")){
            tv = (TextView) findViewById(PreferenceUtils.getID("message_input_text","id"));
            setTextColor(TextUtils.setEditTextColor());
        }

        if(getId() == PreferenceUtils.getID("personal_status_bar_input_text","id")){
            tv = (TextView) findViewById(PreferenceUtils.getID("personal_status_bar_input_text","id"));
            setTextColor(TextUtils.setEditTextColor());
        }

        if(getId() == PreferenceUtils.getID("location_timezone","id")){
            tv = (TextView) findViewById(PreferenceUtils.getID("location_timezone","id"));
            setTextColor(TextUtils.setPrimerTextColor());
        }


        if(getId() == PreferenceUtils.getID("profile_display_description","id")){
            tv = (TextView) findViewById(PreferenceUtils.getID("profile_display_description","id"));
            setTextColor(TextUtils.setWarnaNama());
            setTextSize(20);
            setTypeface(null, Typeface.BOLD);
        }

        if(getId() == PreferenceUtils.getID("call_title","id")){
            tv = (TextView) findViewById(PreferenceUtils.getID("call_title","id"));
            tv.setTextColor(ColorManager.warnaPrimerPutih);
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
