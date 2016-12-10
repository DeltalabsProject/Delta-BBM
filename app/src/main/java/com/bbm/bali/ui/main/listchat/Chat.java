package com.bbm.bali.ui.main.listchat;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by DELTALABS on 12/9/16.
 */

public class Chat implements Parcelable {
    private int id;
    private String nama;
    private String chat;
    private int avatar;

    public Chat() {
    }

    protected Chat(Parcel in) {
        id = in.readInt();
        nama = in.readString();
        chat = in.readString();
        avatar = in.readInt();
    }

    public static final Creator<Chat> CREATOR = new Creator<Chat>() {
        @Override
        public Chat createFromParcel(Parcel in) {
            return new Chat(in);
        }

        @Override
        public Chat[] newArray(int size) {
            return new Chat[size];
        }
    };


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getChat() {
        return chat;
    }

    public void setChat(String chat) {
        this.chat = chat;
    }

    public int getAvatar() {
        return avatar;
    }

    public void setAvatar(int avatar) {
        this.avatar = avatar;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(id);
        parcel.writeString(nama);
        parcel.writeString(chat);
        parcel.writeInt(avatar);
    }


}
