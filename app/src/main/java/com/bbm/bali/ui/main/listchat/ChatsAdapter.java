package com.bbm.bali.ui.main.listchat;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.v4.graphics.drawable.RoundedBitmapDrawable;
import android.support.v4.graphics.drawable.RoundedBitmapDrawableFactory;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import id.delta.bbm.R;

import static com.bbm.Alaska.ctx;

/**
 * Created by DELTALABS on 12/9/16.
 */

public class ChatsAdapter extends RecyclerView.Adapter<ChatsHolder>{

    private List<Chat> chatList;

    public ChatsAdapter(){
        chatList = new ArrayList<>();
    }

    private void add(Chat item) {
        chatList.add(item);
        notifyItemInserted(chatList.size() - 1);
    }

    public void addAll(List<Chat> chatList) {
        for (Chat chat : chatList) {
            add(chat);
        }
    }

    public void remove(Chat item) {
        int position = chatList.indexOf(item);
        if (position > -1) {
            chatList.remove(position);
            notifyItemRemoved(position);
        }
    }

    public void clear() {
        while (getItemCount() > 0) {
            remove(getItem(0));
        }
    }

    public Chat getItem(int position){
        return chatList.get(position);
    }

    @Override
    public ChatsHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item_chat, parent,false);
        ChatsHolder chatsHolder = new ChatsHolder(view);
        return chatsHolder;
    }

    @Override
    public void onBindViewHolder(ChatsHolder holder, int position) {
        final Chat chat = chatList.get(position);
     //   holder.avatarView.setImageResource(chat.getAvatar());
        holder.listName.setText(chat.getNama());
        holder.listChat.setText(chat.getChat());

        Bitmap srcBitmap = BitmapFactory.decodeResource(ctx.getResources(), chat.getAvatar());
        holder.avatarView.setImageBitmap(srcBitmap);
        circularImage(holder.avatarView, srcBitmap);
    }

    @Override
    public int getItemCount() {
        return chatList.size();
    }

    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }

    @Override
    public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        super.onDetachedFromRecyclerView(recyclerView);
    }

    private void circularImage(ImageView imageView, Bitmap srcBitmap) {
        Paint paint = new Paint();

        int srcBitmapWidth = srcBitmap.getWidth();
        int srcBitmapHeight = srcBitmap.getHeight();

        int borderWidth = 2;
        int dstBitmapWidth = Math.min(srcBitmapWidth, srcBitmapHeight) + borderWidth * 2;

        Bitmap dstBitmap = Bitmap.createBitmap(dstBitmapWidth, dstBitmapWidth, Bitmap.Config.ARGB_8888);

        // Initialize a new canvas
        Canvas canvas = new Canvas(dstBitmap);

        // Draw a solid color to canvas
        canvas.drawColor(Color.WHITE);

        // Draw the source bitmap to destination bitmap by keeping border and shadow spaces
        canvas.drawBitmap(srcBitmap, (dstBitmapWidth - srcBitmapWidth) / 2, (dstBitmapWidth - srcBitmapHeight) / 2, null);

        // Use Paint to draw border
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(Color.WHITE);

        // Draw the border in destination bitmap
        canvas.drawCircle(canvas.getWidth() / 2, canvas.getHeight() / 2, canvas.getWidth() / 2, paint);

        // Use Paint to draw shadow
        paint.setColor(Color.LTGRAY);

        // Draw the shadow on circular bitmap
        canvas.drawCircle(canvas.getWidth() / 2, canvas.getHeight() / 2, canvas.getWidth() / 2, paint);


        RoundedBitmapDrawable roundedBitmapDrawable = RoundedBitmapDrawableFactory.create(ctx.getResources(), dstBitmap);


        // Make the ImageView image to a circular image
        roundedBitmapDrawable.setCircular(true);

        roundedBitmapDrawable.setAntiAlias(true);

        // Set the ImageView image as drawable object
        imageView.setImageDrawable(roundedBitmapDrawable);
    }
}
