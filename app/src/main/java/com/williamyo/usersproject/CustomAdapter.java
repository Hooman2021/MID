package com.williamyo.usersproject;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.recyclerview.widget.RecyclerView;

import com.williamyo.model.User;

import java.util.List;

public class CustomAdapter extends RecyclerView.Adapter<ViewHolder>{
    private List<User> _userList;

    public CustomAdapter(List<User> userList){
        this._userList = userList;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType)
    {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View v = inflater.inflate(R.layout.custom_row, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position)
    {
        User u = _userList.get(position);

        holder._usernamaTextView.setText(u.getUsername());
        holder._namaTextView.setText(u.getName());
        holder._emailTextView.setText(u.getEmail());
        holder._idTextView.setText(u.getId());
    }

    @Override
    public int getItemCount()
    {
        int count = 0;
        if (_userList != null){
            count = _userList.size();
        }
        return count;
    }
}
