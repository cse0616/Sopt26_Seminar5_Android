package com.example.oursopt5.recyclerview_menu

import android.graphics.Rect
import android.view.View
import androidx.recyclerview.widget.RecyclerView

class McHomeDecoration(private val size_: Int, private val size: Int) : RecyclerView.ItemDecoration(){

    override fun getItemOffsets(
        outRect: Rect,
        view: View,
        parent: RecyclerView,
        state: RecyclerView.State
    ) {
        super.getItemOffsets(outRect, view, parent, state)
        val position = parent.getChildAdapterPosition(view)

        if(position == 0)
            outRect.left = size_
        outRect.right = size

    }
}