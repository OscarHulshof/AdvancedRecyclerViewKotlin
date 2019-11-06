package com.example.advancedrecyclerviewkotlin.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.advancedrecyclerviewkotlin.Data.ColorItemRepository
import com.example.advancedrecyclerviewkotlin.model.ColorItem

class MainViewModel : ViewModel() {
    private val colorItemRepository = ColorItemRepository()

    val colorItems = MutableLiveData<List<ColorItem>>().apply {
        value = colorItemRepository.getColorItems()
    }
}
