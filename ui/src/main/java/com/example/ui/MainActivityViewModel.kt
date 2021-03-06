package com.example.ui

import androidx.hilt.Assisted
import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel

class MainActivityViewModel @ViewModelInject constructor(
    @Assisted private val savedStateHandle: SavedStateHandle
): ViewModel() {
}