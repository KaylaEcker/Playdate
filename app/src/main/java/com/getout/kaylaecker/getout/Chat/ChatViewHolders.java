package com.getout.kaylaecker.getout.Chat;

import android.support.v7.widget.RecyclerView;
import android.view.View;

/**
 * Created by kaylaecker on 1/21/18.
 */

public class ChatViewHolders extends RecyclerView.ViewHolder implements View.OnClickListener{
    public ChatViewHolders(View itemView) {
        super(itemView);
        itemView.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
    }
}