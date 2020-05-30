package com.example.sopt26seminar5.menu_recycler_menu

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.sopt26seminar5.R

class MenuViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView) {
    val menu_image : ImageView = itemView.findViewById(R.id.menu_image)
    val menu_sort : TextView = itemView.findViewById(R.id.menu_sort)
    val menu_name : TextView = itemView.findViewById(R.id.menu_name)
    val menu_gram : TextView = itemView.findViewById(R.id.menu_gram)
    val menu_kcal : TextView = itemView.findViewById(R.id.menu_kcal)

    fun bind(menuData : MenuData){
        Glide.with(itemView).load(menuData.menuImage).into(menu_image)
        menu_sort.text = menuData.menuSort
        menu_name.text = menuData.menuName
        menu_gram.text = menuData.menuGram + "g"
        menu_kcal.text = menuData.menuKcal + "kcal"
    }
 }