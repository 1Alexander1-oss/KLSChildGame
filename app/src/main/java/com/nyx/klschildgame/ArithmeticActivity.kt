package com.nyx.klschildgame

import android.os.Bundle
import android.view.View
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
    private lateinit var outcomeImages: GridView
    private lateinit var refreshButton: Button

    private var firstTerm = 0
    private var secondTerm = 0
    private val rightAnswer get() = firstTerm + secondTerm
    private var arithmeticSubject = arithmeticSubjects.random()

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
        outcomeImages = findViewById(R.id.outcome_images)
        refreshButton = findViewById(R.id.refresh)

        setScreenContent()

        leftOption.setOnClickListener { showAnswer() }
        rightOption.setOnClickListener { showAnswer() }
        centerOption.setOnClickListener { showAnswer() }

        refreshButton.setOnClickListener {
            outcomeImages.visibility = View.INVISIBLE
            setScreenContent()
        }
    }

    private fun setScreenContent() {
        arithmeticSubject = arithmeticSubjects.random()
        firstTerm = getRandomTerm()
        secondTerm = getRandomTerm()

        leftTerm.text = firstTerm.toString()
        rightTerm.text = secondTerm.toString()

        setupAdapters(firstTerm, secondTerm)
        setOutcomeAdapter()
        setAuxiliaryText(firstTerm, secondTerm)
        setButtonText()
        setQuestion()
    }

    private fun setQuestion() {
        val question = resources.getQuantityString(
            arithmeticSubject.stringResourceId,
            firstTerm
        )

        outcomeText.text = "Сколько $question получится?"
    }

    private fun showAnswer() {
        outcomeImages.visibility = View.VISIBLE

        val firstPart = rightAnswer
        val secondPart = resources.getQuantityString(
            arithmeticSubject.stringResourceId,
            firstPart,
            firstPart
        )

        outcomeText.text = "$rightAnswer $secondPart"
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

    private fun setOutcomeAdapter() {
        val outcomeAdapter = ArithmeticImageItemAdapter(
            this,
            rightAnswer,
            arithmeticSubject.imageResourceId,
        )

        outcomeImages.adapter = outcomeAdapter
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
        val wrongAnswer1 = getRandomExcluding(listOf(rightAnswer))
        val wrongAnswer2 = getRandomExcluding(listOf(rightAnswer, wrongAnswer1))

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