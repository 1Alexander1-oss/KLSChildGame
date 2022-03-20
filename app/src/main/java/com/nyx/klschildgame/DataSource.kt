package com.nyx.klschildgame

const val COLOR_CATEGORY_ID = 1
const val NUMBER_CATEGORY_ID = 2
const val ANIMALS_CATEGORY_ID = 3
const val ARITHMETICS_CATEGORY_ID = 4

const val RED_COLOR_ID = 1
const val GREEN_COLOR_ID = 2
const val BLUE_COLOR_ID = 3
const val YELLOW_COLOR_ID = 4
const val PINK_COLOR_ID = 5
const val BLACK_COLOR_ID = 6
const val GREY_COLOR_ID = 7
const val ORANGE_COLOR_ID = 8
const val PURPLE_COLOR_ID = 9
const val DODGERBLUE_COLOR_ID = 10

const val DOG_SLIDE_ID = 1
const val CAT_SLIDE_ID = 2
const val HAMSTER_SLIDE_ID = 3
const val BEAVER_SLIDE_ID = 4
const val HEDGEHOG_SLIDE_ID = 5
const val JAGUAR_SLIDE_ID = 6
const val LION_SLIDE_ID = 7
const val OWL_SLIDE_ID = 8
const val PIG_SLIDE_ID = 9
const val TIGER_SLIDE_ID = 10


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
    Category(COLOR_CATEGORY_ID, "Цвета", 16184550, R.drawable.turtle, "F3F0D7"),
    Category(NUMBER_CATEGORY_ID, "Цифры", 15590810, R.drawable.terra,"BCFFB9"),
    Category(ANIMALS_CATEGORY_ID, "Животные", 14009429, R.drawable.kavala,"F5FDB0"),
    Category(ARITHMETICS_CATEGORY_ID, "Арифметика", 16636730, R.drawable.lama,"F7E6AD")
)

val colorSlides = listOf(
    ColorSlide(RED_COLOR_ID, "Крас - ный", "FF0000"),
    ColorSlide(GREEN_COLOR_ID, "Зе - лё - ный", "00FF00"),
    ColorSlide(BLUE_COLOR_ID, "Си - ний", "0000FF"),
    ColorSlide(YELLOW_COLOR_ID, "Жёл - тый", "FFFF00"),
    ColorSlide(BLACK_COLOR_ID, "Чёр - ный", "000000"),
    ColorSlide(PINK_COLOR_ID, "Ро - зо - вый", "FFC0CB"),
    ColorSlide(GREY_COLOR_ID, "Се - рый", "808080"),
    ColorSlide(ORANGE_COLOR_ID, "О - ран - же - вый", "FFA500"),
    ColorSlide(PURPLE_COLOR_ID, "Фи - о - ле - то - вый", "800080"),
    ColorSlide(DODGERBLUE_COLOR_ID, "Го - лу - бой", "1E90FF")
)

val animalSlides = listOf(
    PictureSlide(DOG_SLIDE_ID, "Со - ба - ка", R.drawable.dog, R.raw.bark),
    PictureSlide(CAT_SLIDE_ID, "Кот", R.drawable.cat, R.raw.mixkit),
    PictureSlide(HAMSTER_SLIDE_ID, "Хо - мяк", R.drawable.hamster, R.raw.homyak),
    PictureSlide(BEAVER_SLIDE_ID, "Бо - бёр", R.drawable.beaver, R.raw.bobr),
    PictureSlide(HEDGEHOG_SLIDE_ID, "Ёж", R.drawable.hedgehog, R.raw.hedgehog),
    PictureSlide(JAGUAR_SLIDE_ID, "Я - гу - ар", R.drawable.jaguar, R.raw.tigr),
    PictureSlide(LION_SLIDE_ID, "Лев", R.drawable.lion, R.raw.lev),
    PictureSlide(OWL_SLIDE_ID, "Фи - лин", R.drawable.filin, R.raw.filin),
    PictureSlide(PIG_SLIDE_ID, "По - ро - сё - нок", R.drawable.pig, R.raw.porosenok),
    PictureSlide(TIGER_SLIDE_ID, "Тигр", R.drawable.tiger, R.raw.tigr),
)

val numberSlides = listOf(
    NumberSlide(NULL_SLIDE_ID, "Ноль", 0),
    NumberSlide(ONE_SLIDE_ID, "О - дин", 1),
    NumberSlide(TWO_SLIDE_ID, "Два", 2),
    NumberSlide(THREE_SLIDE_ID, "Три", 3),
    NumberSlide(FOUR_SLIDE_ID, "Че - ты - ре", 4),
    NumberSlide(FIVE_SLIDE_ID, "Пять", 5),
    NumberSlide(SIX_SLIDE_ID, "Шесть", 6),
    NumberSlide(SEVEN_SLIDE_ID, "Семь", 7),
    NumberSlide(EIGHT_SLIDE_ID, "Во - семь", 8),
    NumberSlide(NINE_SLIDE_ID, "Де - вять", 9),
    NumberSlide(TEN_SLIDE_ID, "Де - сять", 10),
)

val arithmeticSubjects = listOf(
    ArithmeticSubject(R.drawable.turtle, Noun.FEMININE, R.plurals.turtle),
    ArithmeticSubject(R.drawable.apple, Noun.NEUTER, R.plurals.apple),
    ArithmeticSubject(R.drawable.orange, Noun.MASCULINE, R.plurals.orange),
)
