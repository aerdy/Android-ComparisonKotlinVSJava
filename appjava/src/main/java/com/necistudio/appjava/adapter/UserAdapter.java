package com.necistudio.appjava.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.necistudio.appjava.R;
import com.necistudio.appjava.item.User;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

/**
 * Created by Vim on 5/9/2017.
 */

public class UserAdapter extends RecyclerView.Adapter<UserAdapter.UserHolder>{
    private Context context;
    private ArrayList<User> items;
    public UserAdapter(Context context,ArrayList<User> items){
        this.context = context;
        this.items = items;
    }

    @Override
    public UserHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.useritem,parent,false);
        return new UserHolder(view);
    }

    @Override
    public void onBindViewHolder(UserHolder holder, int position) {
        User user = items.get(position);
        holder.txtTitle.setText(user.getTitle());
        Picasso.with(context)
                .load(user.getImgData())
                .into(holder.imgUser);
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    class UserHolder extends RecyclerView.ViewHolder{
        TextView txtTitle;
        ImageView imgUser;

        public UserHolder(View itemView) {
            super(itemView);
            txtTitle = (TextView)itemView.findViewById(R.id.txtTitle);
            imgUser = (ImageView)itemView.findViewById(R.id.imgData);
        }
    }
}
