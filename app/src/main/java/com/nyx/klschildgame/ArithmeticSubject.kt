package com.nyx.klschildgame

data class ArithmeticSubject(
    val imageResourceId: Int,
    val noun: Noun,
    val stringResourceId: Int,
) {
    fun getNumeral(number: Int): String {
        return when (number) {
            1 -> when (noun) {
                Noun.NEUTER -> "Одно"
                Noun.FEMININE -> "Одна"
                Noun.MASCULINE -> "Один"
            }
            2 -> when (noun) {
                Noun.NEUTER -> "Два"
                Noun.FEMININE -> "Две"
                Noun.MASCULINE -> "Два"
            }
            3 -> "Три"
            4 -> "Четыре"
            5 -> "Пять"
            else -> "Нет числительного"
        }
    }
}

enum class Noun {
    NEUTER,
    FEMININE,
    MASCULINE
}
