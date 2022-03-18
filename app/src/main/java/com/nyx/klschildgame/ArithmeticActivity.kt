package com.nyx.klschildgame

import android.os.Bundle
import android.widget.Button
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
    private lateinit var outcomeText: TextView
    private lateinit var leftOption: Button
    private lateinit var centerOption: Button
    private lateinit var rightOption: Button

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
        outcomeText = findViewById(R.id.outcome_text)
        leftOption = findViewById(R.id.left_option)
        centerOption = findViewById(R.id.center_option)
        rightOption = findViewById(R.id.right_option)

        setupAdapters(firstTerm, secondTerm)
        setAuxiliaryText(firstTerm, secondTerm)
        setButtonText()

        leftTerm.text = firstTerm.toString()
        rightTerm.text = secondTerm.toString()

        leftOption.setOnClickListener {}
        rightOption.setOnClickListener {}
        centerOption.setOnClickListener {}

    }

    private fun getRandomTerm(): Int {
        return Random.nextInt(1, 6)
    }

    private fun getRandomExcluding(exclusive: List<Int>): Int {
        val result: Int

        while (true) {
            val randomValue = Random.nextInt(1, 11)
            if (!exclusive.contains(randomValue)) {
                result = randomValue
                break
            }
        }
        return result
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

    private fun setButtonText() {
        val rightAnswer = firstTerm + secondTerm
        val wrongAnswer1 = getRandomExcluding(listOf(rightAnswer))
        val wrongAnswer2 = getRandomExcluding(listOf(rightAnswer,wrongAnswer1))

        val buttonValues = mutableListOf(
            rightAnswer,
            wrongAnswer1,
            wrongAnswer2,
        )

        val leftValue = buttonValues.random().also { buttonValues.remove(it) }
        val centralValue = buttonValues.random().also { buttonValues.remove(it) }
        val rightValue = buttonValues.random()

        leftOption.text = leftValue.toString()
        centerOption.text = centralValue.toString()
        rightOption.text = rightValue.toString()
    }
}