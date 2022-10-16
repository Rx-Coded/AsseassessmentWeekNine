package com.example.assessmentweeknine.ui.MyFriends

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MyFriendsViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "My friends are super exciting humans hopefully you have great friends in your corner."
    }
    val text: LiveData<String> = _text
}