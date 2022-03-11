package com.nyx.klschildgame

import android.content.Intent
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

    override fun categoryClick(id: Int) {
        if (id == ARITHMETICS_CATEGORY_ID) {
        } else {
            val intent = Intent(this, ImageCategoryActivity::class.java)
            intent.putExtra(ImageCategoryActivity.ID_KEY, id)
            startActivity(intent)
        }
    }
}