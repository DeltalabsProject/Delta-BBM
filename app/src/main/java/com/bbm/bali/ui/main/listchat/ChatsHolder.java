package com.bbm.bali.ui.main.listchat;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import id.delta.bbm.R;

/**
 * Created by DELTALABS on 12/9/16.
 */

public class ChatsHolder extends RecyclerView.ViewHolder {

    ImageView avatarView;
    TextView listName;
    TextView listChat;

    public ChatsHolder(View itemView) {
        super(itemView);
        avatarView = (ImageView) itemView.findViewById(R.id.avatar_view);
        listName = (TextView) itemView.findViewById(R.id.chat_title);
        listChat = (TextView) itemView.findViewById(R.id.chat_message);
    }
}
