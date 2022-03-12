package com.nyx.klschildgame

const val COLOR_CATEGORY_ID = 1
const val NUMBER_CATEGORY_ID = 2
const val ANIMALS_CATEGORY_ID = 3
const val ARITHMETICS_CATEGORY_ID = 4

const val RED_COLOR_ID = 1
const val GREEN_COLOR_ID = 2
const val BLUE_COLOR_ID = 3
const val YELLOW_COLOR_ID = 4

const val DOG_SLIDE_ID = 1
const val CAT_SLIDE_ID = 2
const val HAMSTER_SLIDE_ID = 3

const val NULL_SLIDE_ID = 0
const val ONE_SLIDE_ID = 1
const val TWO_SLIDE_ID = 2
const val THREE_SLIDE_ID = 3
const val FOUR_SLIDE_ID = 4
const val FIVE_SLIDE_ID = 5
const val SIX_SLIDE_ID = 6
const val SEVEN_SLIDE_ID = 7
const val EIGHT_SLIDE_ID = 8
const val NINE_SLIDE_ID = 9
const val TEN_SLIDE_ID = 10


val categories = listOf(
    Category(COLOR_CATEGORY_ID, "Цвета", 16766720),
    Category(NUMBER_CATEGORY_ID, "Цифры", 3714781),
    Category(ANIMALS_CATEGORY_ID, "Животные", 12648254),
    Category(ARITHMETICS_CATEGORY_ID, "Арифметика", 5890798)
)

val colorSlides = listOf(
    ColorSlide(RED_COLOR_ID, "Красный", "FF0000"),
    ColorSlide(GREEN_COLOR_ID, "Зелёный", "00FF00"),
    ColorSlide(BLUE_COLOR_ID, "Синий", "0000FF"),
    ColorSlide(YELLOW_COLOR_ID, "Жёлтый", "FFFF00")
)

val animalSlides = listOf(
    PictureSlide(DOG_SLIDE_ID, "Собака", R.drawable.dog),
    PictureSlide(CAT_SLIDE_ID, "Кот", R.drawable.cat),
    PictureSlide(HAMSTER_SLIDE_ID, "Хомяк", R.drawable.hamster)
)

val numberSlides = listOf(
    NumberSlide(NULL_SLIDE_ID, "Ноль", 0),
    NumberSlide(ONE_SLIDE_ID, "Один", 1),
    NumberSlide(TWO_SLIDE_ID, "Два", 2),
    NumberSlide(THREE_SLIDE_ID, "Три", 3),
    NumberSlide(FOUR_SLIDE_ID, "Четыре", 4),
    NumberSlide(FIVE_SLIDE_ID, "Пять", 5),
    NumberSlide(SIX_SLIDE_ID, "Шесть", 6),
    NumberSlide(SEVEN_SLIDE_ID, "Семь", 7),
    NumberSlide(EIGHT_SLIDE_ID, "Восемь", 8),
    NumberSlide(NINE_SLIDE_ID, "Девять", 9),
    NumberSlide(TEN_SLIDE_ID, "Десять", 10),
)