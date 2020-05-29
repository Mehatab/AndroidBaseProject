package com.starter.data.database.dao

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Query
import com.starter.data.database.entities.Hello

@Dao
interface HelloDao {
    @Query("SELECT * FROM Hello")
    fun getMessages(): LiveData<Hello>
}