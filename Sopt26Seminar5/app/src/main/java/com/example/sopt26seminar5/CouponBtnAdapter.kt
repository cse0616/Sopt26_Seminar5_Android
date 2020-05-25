package com.example.sopt26seminar5

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class CouponBtnAdapter(private val context : Context) : RecyclerView.Adapter<CouponBtnViewHolder>() {
    var datas = mutableListOf<CouponBtnData>()
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CouponBtnViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_coupon_button, parent, false)
        return CouponBtnViewHolder(view)
    }

    override fun getItemCount(): Int {
        return datas.size
    }

    override fun onBindViewHolder(holder: CouponBtnViewHolder, position: Int) {
        holder.bind(datas[position])
    }

}