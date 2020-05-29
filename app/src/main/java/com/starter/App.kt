package com.starter

import android.app.Application
import com.starter.data.di.dataModule
import com.starter.feature1.di.feature1Module
import com.starter.uicomponents.di.uiComponentsModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

class App : Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidLogger()
            androidContext(this@App)
            modules(listOf(dataModule, uiComponentsModule, feature1Module))
        }
    }
}