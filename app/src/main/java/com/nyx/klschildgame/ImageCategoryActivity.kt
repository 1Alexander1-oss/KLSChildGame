package com.nyx.klschildgame

import android.graphics.Color
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ImageCategoryActivity : AppCompatActivity() {
    private lateinit var slideImage: ImageView
    private lateinit var slideName: TextView

    companion object {
        const val ID_KEY = "ID_KEY"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_image_category)

        slideImage = findViewById(R.id.slide_image)
        slideName = findViewById(R.id.slide_name)

        val id = intent.getIntExtra(ID_KEY, 0)
        if (id == COLOR_CATEGORY_ID) {
            val firstColorSlide = colorSlides[0]

            slideName.text = firstColorSlide.name
            val color = firstColorSlide.color

            val colorHex = "#${color.toString(16)}"
            slideImage.setBackgroundColor(Color.parseColor(colorHex))
        }
    }
}