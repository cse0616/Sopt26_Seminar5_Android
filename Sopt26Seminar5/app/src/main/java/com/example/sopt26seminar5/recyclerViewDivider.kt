package com.example.sopt26seminar5

import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.RecyclerView

fun RecyclerView.recyclerViewDivider() {
    //val divider = DividerItemDecoration(context, DividerItemDecoration.VERTICAL)
    val divider = DividerItemDecoration(context, DividerItemDecoration.HORIZONTAL)
    this.addItemDecoration(divider)
}