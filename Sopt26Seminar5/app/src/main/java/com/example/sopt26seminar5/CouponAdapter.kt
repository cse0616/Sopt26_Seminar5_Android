package com.example.sopt26seminar5

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class CouponAdapter(private val context: Context) : RecyclerView.Adapter<CouponViewHolder>() {
    var datas = mutableListOf<CouponData>()
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CouponViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_coupon, parent,false)
        return CouponViewHolder(view)
    }

    override fun getItemCount(): Int {
        return datas.size
    }

    override fun onBindViewHolder(holder: CouponViewHolder, position: Int) {
        holder.bind(datas[position])
    }

}