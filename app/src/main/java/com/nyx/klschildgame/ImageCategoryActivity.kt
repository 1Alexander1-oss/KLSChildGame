package com.nyx.klschildgame

import android.graphics.Color
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ImageCategoryActivity : AppCompatActivity() {
    private lateinit var slideImage: ImageView
    private lateinit var slideName: TextView
    private lateinit var buttonNext: Button
    private lateinit var buttonBack: Button
    private var currentSlideIndex = 0
    private var dataSource: List<Slide> = listOf()

    companion object {
        const val ID_KEY = "ID_KEY"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_image_category)

        slideImage = findViewById(R.id.slide_image)
        slideName = findViewById(R.id.slide_name)
        buttonNext = findViewById(R.id.button_next)
        buttonBack = findViewById(R.id.button_back)

        val categoryId = intent.getIntExtra(ID_KEY, 0)
        if (categoryId == COLOR_CATEGORY_ID) {
            dataSource = colorSlides
        } else if (categoryId == ANIMALS_CATEGORY_ID) {
            dataSource = animalSlides
        }

        displaySlide(currentSlideIndex)

        buttonNext.setOnClickListener {
            if (currentSlideIndex == dataSource.lastIndex) {
                currentSlideIndex = 0
            } else {
                currentSlideIndex++
            }

            displaySlide(currentSlideIndex)
        }

        buttonBack.setOnClickListener {
            if (currentSlideIndex == 0) {
                currentSlideIndex = dataSource.lastIndex
            } else {
                currentSlideIndex--
            }

            displaySlide(currentSlideIndex)
        }
    }

    private fun displaySlide(currentIndex: Int) {
        val currentSlide = dataSource[currentIndex]

        slideName.text = currentSlide.name

        if (currentSlide is ColorSlide) {
            val color = currentSlide.color
            slideImage.setBackgroundColor(Color.parseColor("#$color"))
        } else if (currentSlide is PictureSlide) {
            val pictureResId = currentSlide.resourceId
            slideImage.setImageResource(pictureResId)
        }
    }
}