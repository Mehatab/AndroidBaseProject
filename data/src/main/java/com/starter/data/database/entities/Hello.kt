package com.starter.data.database.entities

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Hello(
    @PrimaryKey
    var id: Long? = null,
    var msg: String? = null
)