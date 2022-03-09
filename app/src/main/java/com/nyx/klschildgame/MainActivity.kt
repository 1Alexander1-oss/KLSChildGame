package com.nyx.klschildgame

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity(), CategoryClickListener {
    private lateinit var recycler: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recycler = findViewById(R.id.recycler)
        recycler.layoutManager = LinearLayoutManager(this)
        recycler.adapter = CategoryAdapter(categories, this)
    }


    private val categories = listOf(
        Category(1, "Цвета", 16766720),
        Category(2, "Цифры", 3714781),
        Category(3, "Животные", 12648254),
        Category(4, "Арифметика", 5890798)
    )

    override fun categoryClick(id: Int) {
        val category = categories.find { it.id == id }
        println("${category?.name}")
    }
}