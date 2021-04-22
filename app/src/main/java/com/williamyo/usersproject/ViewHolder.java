package com.williamyo.usersproject;

import android.view.View;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

public class ViewHolder extends RecyclerView.ViewHolder {
    public TextView _usernamaTextView;
    public TextView _namaTextView;
    public TextView _idTextView;
    public TextView _emailTextView;

    public ViewHolder(View itemView){
        super(itemView);
        _idTextView = (TextView) itemView.findViewById(R.id.idTextView);
        _usernamaTextView = (TextView) itemView.findViewById(R.id.usernamaTextView);
        _namaTextView = (TextView) itemView.findViewById(R.id.namaTextView);
        _emailTextView = (TextView) itemView.findViewById(R.id.emailTextView);

    }
}
