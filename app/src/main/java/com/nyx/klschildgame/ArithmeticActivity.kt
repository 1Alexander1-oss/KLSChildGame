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
    private lateinit var rightAuxiliaryText: TextView
    private lateinit var leftAuxiliaryText: TextView

    private val firstTerm = getRandomTerm()
    private val secondTerm = getRandomTerm()
    private val arithmeticSubject = arithmeticSubjects.random()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_arithmetic)

        leftListView = findViewById(R.id.left_list_view)
        rightListView = findViewById(R.id.right_list_view)
        leftTerm = findViewById(R.id.left_term)
        rightTerm = findViewById(R.id.right_term)
        rightAuxiliaryText = findViewById(R.id.right_auxiliary_text)
        leftAuxiliaryText = findViewById(R.id.left_auxiliary_text)

        setupAdapters(firstTerm, secondTerm)
        setAuxiliaryText(firstTerm, secondTerm)

        leftTerm.text = firstTerm.toString()
        rightTerm.text = secondTerm.toString()
    }

    private fun getRandomTerm(): Int {
        return Random.nextInt(1, 6)
    }

    private fun setAuxiliaryText(firstTerm: Int, secondTerm: Int) {
        val firstTermNoun = resources.getQuantityString(
            arithmeticSubject.stringResourceId,
            firstTerm,
            firstTerm
        )

        val firstTermNumeral = arithmeticSubject.getNumeral(firstTerm)

        leftAuxiliaryText.text = "$firstTermNumeral $firstTermNoun"

        val secondTermNoun = resources.getQuantityString(
            arithmeticSubject.stringResourceId,
            secondTerm,
            secondTerm
        )

        val secondTermNumeral = arithmeticSubject.getNumeral(secondTerm)

        rightAuxiliaryText.text = "$secondTermNumeral $secondTermNoun"
    }

    private fun setupAdapters(firstTerm: Int, secondTerm: Int) {
        val leftTermAdapter = ArithmeticImageItemAdapter(
            this,
            firstTerm,
            arithmeticSubject.imageResourceId,
        )

        val rightTermAdapter = ArithmeticImageItemAdapter(
            this,
            secondTerm,
            arithmeticSubject.imageResourceId
        )

        leftListView.adapter = leftTermAdapter
        rightListView.adapter = rightTermAdapter
    }
}