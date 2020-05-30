package com.example.sopt26seminar5.menu_recycler_menu

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.sopt26seminar5.R

class MenuAdapter(private val context : Context) : RecyclerView.Adapter<MenuViewHolder>(){
    var datas = mutableListOf<MenuData>()
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MenuViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_menu,parent,false)
        return MenuViewHolder(view)
    }

    override fun getItemCount(): Int {
        return datas.size
    }

    override fun onBindViewHolder(holder: MenuViewHolder, position: Int) {
        holder.bind(datas[position])
    }
}