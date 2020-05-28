package com.example.sopt26seminar5

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.sopt26seminar5.CategoryData
import com.example.sopt26seminar5.CategoryViewHolder
import com.example.sopt26seminar5.R

class CategoryViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView) {
    val category_image : ImageView = itemView.findViewById(R.id.category_image)
    val category_name : TextView = itemView.findViewById(R.id.category_name)

    fun bind(categoryData : CategoryData){
        Glide.with(itemView).load(categoryData.categoryImage).into(category_image)
        category_name.text = categoryData.categoryName
    }
}