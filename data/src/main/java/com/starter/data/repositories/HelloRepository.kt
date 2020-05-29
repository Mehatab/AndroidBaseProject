package com.starter.data.repositories

import com.starter.data.database.dao.HelloDao

class HelloRepository(private val helloDao: HelloDao) {
    fun getMessage() = "Hello World!"
}