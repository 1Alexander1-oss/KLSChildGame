package com.nyx.klschildgame

const val COLOR_CATEGORY_ID = 1
const val NUMBER_CATEGORY_ID = 2
const val ANIMALS_CATEGORY_ID = 3
const val ARITHMETICS_CATEGORY_ID = 4

const val RED_COLOR_ID = 1
const val GREEN_COLOR_ID = 2
const val BLUE_COLOR_ID = 3

val categories = listOf(
    Category(COLOR_CATEGORY_ID, "Цвета", 16766720),
    Category(NUMBER_CATEGORY_ID, "Цифры", 3714781),
    Category(ANIMALS_CATEGORY_ID, "Животные", 12648254),
    Category(ARITHMETICS_CATEGORY_ID, "Арифметика", 5890798)
)

val colorSlides = listOf(
    ColorSlide(RED_COLOR_ID, "Красный", "FF0000"),
    ColorSlide(GREEN_COLOR_ID, "Зелёный", "00FF00"),
    ColorSlide(BLUE_COLOR_ID, "Синий", "0000FF")
)
