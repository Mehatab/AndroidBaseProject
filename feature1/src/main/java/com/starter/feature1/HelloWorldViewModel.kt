package com.starter.feature1

import androidx.databinding.ObservableField
import androidx.lifecycle.ViewModel
import com.starter.data.repositories.HelloRepository

class HelloWorldViewModel(private val helloRepository: HelloRepository) : ViewModel() {
    val message = ObservableField<String>().apply {
        set(helloRepository.getMessage())
    }
}