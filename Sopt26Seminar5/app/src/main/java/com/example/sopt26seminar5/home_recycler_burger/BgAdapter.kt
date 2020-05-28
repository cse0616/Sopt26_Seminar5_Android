package com.example.oursopt5.recyclerview_burger

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.sopt26seminar5.R

class BgAdapter(private val context : Context) : RecyclerView.Adapter<BgViewHolder>() {
    var datas = mutableListOf<BgData>()
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BgViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.activity_recyclerview_bg,parent,false)
        return BgViewHolder(view)

    }

    override fun getItemCount(): Int {
        return datas.size
    }

    override fun onBindViewHolder(holder: BgViewHolder, position: Int) {
        holder.bind(datas[position])
    }

}
