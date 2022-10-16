package com.example.assessmentweeknine.ui.Me

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MeViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Im jennifer when ever im not trying to escape pharm school im trying to get rid of bugs"
    }
    val text: LiveData<String> = _text
}