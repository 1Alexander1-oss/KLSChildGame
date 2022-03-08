package com.nyx.klschildgame

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        println(categories)
    }

    private val categories = listOf(
        Category(1, "Цвета", 16766720),
        Category(2, "Цифры", 3714781),
        Category(3, "Животные", 12648254),
        Category(4, "Арифметика", 5890798)
    )
}