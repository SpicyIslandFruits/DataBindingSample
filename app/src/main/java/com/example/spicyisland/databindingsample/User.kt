package com.example.spicyisland.databindingsample

import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel

class User: ViewModel() {
    val name = MutableLiveData<MutableList<String>>()
    init {
        name.value = mutableListOf("before", "before")

    }
}

lateinit var user: User