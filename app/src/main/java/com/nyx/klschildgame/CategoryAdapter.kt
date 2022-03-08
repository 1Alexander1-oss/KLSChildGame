package com.nyx.klschildgame

import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CategoryViewHolder(
    itemView: View,
) : RecyclerView.ViewHolder(itemView) {
    fun setContent(category: Category) {
        val colorHex = "#${category.color.toString(16)}"

        itemView.setBackgroundColor(Color.parseColor(colorHex))

        val categoryTextView = itemView.findViewById<TextView>(R.id.category)
        categoryTextView.text = category.name
    }
}

class CategoryAdapter(
    private val categories: List<Category>,
) : RecyclerView.Adapter<CategoryViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoryViewHolder {
        return CategoryViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.category_item,
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: CategoryViewHolder, position: Int) {
        val category = categories[position]
        holder.setContent(category)
    }

    override fun getItemCount(): Int {
        return categories.size
    }
}