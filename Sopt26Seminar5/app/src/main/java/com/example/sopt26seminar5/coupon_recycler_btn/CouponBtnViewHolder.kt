package com.example.sopt26seminar5.coupon_recycler_btn

import android.view.View
import android.widget.Button
import androidx.recyclerview.widget.RecyclerView
import com.example.sopt26seminar5.R


class CouponBtnViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    val menu = itemView.findViewById<Button>(R.id.coupon_btn)

    fun bind(couponBtnData: CouponBtnData){
        menu.text = couponBtnData.menu
    }
}