package com.example.oursopt5.recyclerview_burger

import android.graphics.Paint
import android.view.View
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.sopt26seminar5.R
import kotlinx.android.synthetic.main.activity_recyclerview_bg.view.*


class BgViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    val imageView = itemView.findViewById<ImageView>(R.id.imageView)
    val explain = itemView.findViewById<TextView>(R.id.explain)
    val burger_name = itemView.findViewById<TextView>(R.id.burger_name)
    val price = itemView.findViewById<TextView>(R.id.price)
    val sale = itemView.findViewById<TextView>(R.id.sale)
    val discount = itemView.findViewById<TextView>(R.id.discount)

    //val coupon_btn = itemView.findViewById<ImageButton>(R.id.coupon_btn)

    fun bind(bgData: BgData){
       explain.text = bgData.explain
        Glide.with(itemView).load(bgData.imageView).into(imageView)
        burger_name.text = bgData.burger_name
        price.text = bgData.price
        price.setPaintFlags(price.paintFlags or Paint.STRIKE_THRU_TEXT_FLAG)
        sale.text = bgData.sale
        discount.text = bgData.discount
        //Glide.with(itemView).load(bgData.coupon_btn).into(coupon_btn)
    }
}