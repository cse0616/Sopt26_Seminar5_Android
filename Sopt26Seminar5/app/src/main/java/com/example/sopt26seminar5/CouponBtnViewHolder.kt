package com.example.sopt26seminar5

import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class CouponBtnViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    val menu = itemView.findViewById<Button>(R.id.coupon_btn)

    fun bind(couponBtnData: CouponBtnData){
        menu.text = couponBtnData.menu
    }
}