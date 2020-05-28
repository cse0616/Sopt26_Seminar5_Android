package com.example.oursopt5.recyclerview_menu

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.sopt26seminar5.R

class MenuBtnAdapter(private val context : Context) : RecyclerView.Adapter<MenuBtnViewHolder>() {
    var datas = mutableListOf<MenuBtnData>()
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MenuBtnViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.activity_recyclerview_menu,parent,false)
        return MenuBtnViewHolder(view)

    }

    override fun getItemCount(): Int {
        return datas.size
    }

    override fun onBindViewHolder(holder: MenuBtnViewHolder, position: Int) {
        holder.bind(datas[position])
    }

}
