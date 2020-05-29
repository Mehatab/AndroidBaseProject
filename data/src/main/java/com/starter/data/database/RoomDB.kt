package com.starter.data.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.starter.data.database.dao.HelloDao
import com.starter.data.database.entities.Hello


@Database(
    entities = [Hello::class],
    version = 1
)
abstract class RoomDB : RoomDatabase() {
    abstract fun helloDao(): HelloDao

    companion object {
        const val DB_NAME = "starter.db"
    }
}