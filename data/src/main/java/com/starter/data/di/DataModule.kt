package com.starter.data.di

import androidx.room.Room
import com.starter.data.database.RoomDB
import com.starter.data.database.RoomDB.Companion.DB_NAME
import com.starter.data.preference.PreferenceHelper
import com.starter.data.repositories.HelloRepository
import org.koin.android.ext.koin.androidContext
import org.koin.dsl.module

val dataModule = module {
    factory { HelloRepository(get()) }
    single { get<RoomDB>().helloDao() }

    single { PreferenceHelper(androidContext()) }

    single {
        Room.databaseBuilder(androidContext(), RoomDB::class.java, DB_NAME).build()
    }
}