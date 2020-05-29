package com.starter.feature1.di

import com.starter.feature1.HelloWorldViewModel
import org.koin.dsl.module
import org.koin.android.viewmodel.dsl.viewModel

val feature1Module = module{
    viewModel { HelloWorldViewModel(get()) }
}