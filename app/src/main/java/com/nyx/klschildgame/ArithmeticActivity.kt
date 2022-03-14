package com.nyx.klschildgame

import android.os.Bundle
import android.widget.GridView
import androidx.appcompat.app.AppCompatActivity

class ArithmeticActivity : AppCompatActivity() {
    private lateinit var leftListView: GridView
    private lateinit var rightListView: GridView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_arithmetic)

        leftListView = findViewById(R.id.left_list_view)
        rightListView = findViewById(R.id.right_list_view)



        val adapter = ArithmeticImageItemAdapter(
            this,
            listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18),
            R.drawable.turtle
        )
        leftListView.adapter = adapter
        rightListView.adapter = adapter
    }
}