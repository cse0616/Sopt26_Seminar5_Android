package com.example.oursopt5.recyclerview_menu

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.sopt26seminar5.R

class MenuBtnViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    val menu = itemView.findViewById<ImageView>(R.id.menu)
    val menu_name = itemView.findViewById<TextView>(R.id.menu_name)

    fun bind(menubtnData: MenuBtnData){
       menu_name.text = menubtnData.menu_name
        Glide.with(itemView).load(menubtnData.menu).into(menu)

    }
}