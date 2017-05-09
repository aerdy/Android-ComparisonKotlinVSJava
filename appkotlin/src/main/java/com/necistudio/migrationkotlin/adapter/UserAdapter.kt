package com.necistudio.migrationkotlin.adapter

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import butterknife.ButterKnife
import com.necistudio.migrationkotlin.R
import com.necistudio.migrationkotlin.item.User
import com.squareup.picasso.Picasso

/**
 * Created by Vim on 5/9/2017.
 */

class UserAdapter(var context: Context,var items: ArrayList<User>) : RecyclerView.Adapter<UserAdapter.UserHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): UserHolder {
        var view:View = LayoutInflater.from(parent!!.context).inflate(R.layout.useritem,parent,false)
        return UserHolder(view)
    }

    override fun onBindViewHolder(holder: UserHolder?, position: Int) {
        var user:User = items.get(position)
        holder!!.txtTitle.setText(user.name)
        Picasso.with(context)
                .load(user.imageData)
                .into(holder!!.imgData)
    }

    override fun getItemCount(): Int {
        return items.size
    }


    class UserHolder(itemView: View?) : RecyclerView.ViewHolder(itemView) {
        var txtTitle:TextView = itemView!!.findViewById(R.id.txtTitle) as TextView
        var imgData:ImageView = itemView!!.findViewById(R.id.imgData) as ImageView
    }
}