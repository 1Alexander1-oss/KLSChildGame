package com.nyx.klschildgame

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView

class ArithmeticImageItemAdapter(
    private val context: Context,
    private val items: List<Int>,
    private val imageResId: Int,
) : BaseAdapter() {
    override fun getCount(): Int = items.size

    override fun getItem(position: Int) = items[position]

    override fun getItemId(position: Int) = items[position].toLong()

    override fun getView(position: Int, p1: View?, parent: ViewGroup?): View {
        val inflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        val imageView = inflater.inflate(
            R.layout.arithmetic_image_item,
            parent,
            false
        ) as ImageView

        imageView.setImageResource(imageResId)

        return imageView
    }
}