package com.bbm.bali.ui.main.fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bbm.bali.ui.main.a.h;
import com.bbm.bali.ui.main.listchat.Chat;
import com.bbm.bali.ui.main.listchat.ChatsAdapter;

import java.util.ArrayList;
import java.util.List;

import id.delta.bbm.R;

/**
 * Created by DELTALABS on 12/9/16.
 */

public class FragmentChat extends h {

    private RecyclerView listChat;
    private LinearLayoutManager linearLayoutManager;
    private ChatsAdapter chatsAdapter;
    protected Context context;

    public static FragmentChat newInstance(){
        return new FragmentChat();
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        this.context = context;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootview = inflater.inflate(R.layout.fragment_chat, container, false);
        listChat = (RecyclerView)rootview.findViewById(R.id.recycler_list_chat);
        return rootview;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        linearLayoutManager = new LinearLayoutManager(context);
        chatsAdapter = new ChatsAdapter();
        listChat.setLayoutManager(linearLayoutManager);
        listChat.setAdapter(chatsAdapter);
        dataChat();
    }

    private void dataChat(){
        List<Chat> chatList = new ArrayList<>();
        Chat chats;
        int avatar[]={
                R.drawable.profile_alvaro,
                R.drawable.profile_anca,
                R.drawable.profile_andyxialm,
                R.drawable.profile_ciben,
                R.drawable.profile_dhian,
                R.drawable.profile_dwd,
                R.drawable.profile_flavioarfaria,
                R.drawable.profile_irule,
                R.drawable.profile_jgilfelt,
                R.drawable.profile_jq,
                R.drawable.profile_keysa,
                R.drawable.profile_lopes,
                R.drawable.profile_trangga,
        };

        String nama[]={"Alvaro","Anca Imut","Andy Xialm","Ciben","Dhian Rusdhiana","Darwandi","Flavioarfaria","Irule","Jgilfet","JQ","Keysa","Lopes","Trangga Ken"};
        String chat= getString(R.string.chats);

        for (int i=0; i<avatar.length;i++){
            chats = new Chat();
            chats.setId(i+1);
            chats.setNama(nama[i]);
            chats.setChat(chat);
            chats.setAvatar(avatar[i]);
            chatList.add(chats);
        }
        chatsAdapter.addAll(chatList);
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
    }
}
