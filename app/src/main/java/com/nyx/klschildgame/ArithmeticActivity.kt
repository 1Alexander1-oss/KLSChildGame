package com.nyx.klschildgame

import android.os.Bundle
import android.widget.GridView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlin.random.Random

class ArithmeticActivity : AppCompatActivity() {
    private lateinit var leftListView: GridView
    private lateinit var rightListView: GridView
    private lateinit var leftTerm: TextView
    private lateinit var rightTerm: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_arithmetic)

        leftListView = findViewById(R.id.left_list_view)
        rightListView = findViewById(R.id.right_list_view)
        leftTerm = findViewById(R.id.left_term)
        rightTerm = findViewById(R.id.right_term)


        val firstTerm = getRandomTerm()
        val secondTerm = getRandomTerm()

        val leftTermAdapter = ArithmeticImageItemAdapter(
            this,
            firstTerm,
            R.drawable.turtle
        )

        val rightTermAdapter = ArithmeticImageItemAdapter(
            this,
            secondTerm,
            R.drawable.turtle
        )

        leftListView.adapter = leftTermAdapter
        rightListView.adapter = rightTermAdapter

        leftTerm.text = firstTerm.toString()
        rightTerm.text = secondTerm.toString()
    }

    private fun getRandomTerm(): Int {
        return Random.nextInt(1, 6)
    }

}