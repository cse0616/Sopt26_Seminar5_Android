package com.example.sopt26seminar5.coupon_recycler_coupon

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.sopt26seminar5.R


class CouponViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    val menu = itemView.findViewById<TextView>(R.id.txt_rv_menu)
    val name = itemView.findViewById<TextView>(R.id.txt_rv_name)
    val price = itemView.findViewById<TextView>(R.id.txt_rv_price)
    val price_origin = itemView.findViewById<TextView>(R.id.txt_rv_price_origin)
    val date = itemView.findViewById<TextView>(R.id.txt_rv_date)
    val img_menu = itemView.findViewById<ImageView>(R.id.img_rv_menu)

    fun bind(couponData: CouponData){
        Glide.with(itemView).load(couponData.img_menu).into(img_menu)
        menu.text = couponData.menu
        name.text = couponData.name
        price.text = couponData.price.toString() + "원"
        price_origin.text = couponData.price_origin.toString() + "원"
        date.text = couponData.date
    }
}