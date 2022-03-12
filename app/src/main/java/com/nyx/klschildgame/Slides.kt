package com.nyx.klschildgame

open class Slide(open val id: Int, open val name: String)

data class ColorSlide(
    override val id: Int,
    override val name: String,
    val color: String,
) : Slide(id, name)

data class PictureSlide(
    override val id: Int,
    override val name: String,
    val resourceId: Int,
) : Slide(id, name)
