package com.example.advancedrecyclerviewkotlin.Data

import com.example.advancedrecyclerviewkotlin.model.ColorItem

class ColorItemRepository {
    fun getColorItems(): List<ColorItem> {
        return arrayListOf(
            ColorItem("000000", "Black"),
            ColorItem("FF0000", "Red"),
            ColorItem("0000FF", "Blue"),
            ColorItem("FFFF00", "Yellow"),
            ColorItem("008000", "Green")
        )
    }
}