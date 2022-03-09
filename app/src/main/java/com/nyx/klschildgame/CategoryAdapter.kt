package com.nyx.klschildgame

import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CategoryViewHolder(
    itemView: View,
    private val listener: CategoryClickListener,
) : RecyclerView.ViewHolder(itemView) {
    fun setContent(category: Category) {
        val colorHex = "#${category.color.toString(16)}"

        itemView.setBackgroundColor(Color.parseColor(colorHex))

        val categoryTextView = itemView.findViewById<TextView>(R.id.category)
        categoryTextView.text = category.name

        itemView.setOnClickListener {
            listener.categoryClick(category.id)
        }
    }
}

class CategoryAdapter(
    private val categories: List<Category>,
    private val listener: CategoryClickListener,
) : RecyclerView.Adapter<CategoryViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoryViewHolder {
        return CategoryViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.category_item,
                parent,
                false
            ),
            listener
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