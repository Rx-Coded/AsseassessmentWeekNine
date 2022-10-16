package com.example.assessmentweeknine.ui.MyFamily

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MyFamilyViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "I so much love my family and there is nothing i would not do for them."
    }
    val text: LiveData<String> = _text
}