package com.starter.data.preference

import android.content.SharedPreferences
import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty


private class PreferenceDelegate<T>(
    private val sharedPreferences: SharedPreferences,
    private val defaultValue: T
) : ReadWriteProperty<Any, T> {
    override fun getValue(thisRef: Any, property: KProperty<*>): T {
        return when (defaultValue) {
            is String -> sharedPreferences.getString(property.name, defaultValue) ?: defaultValue
            is Int -> sharedPreferences.getInt(property.name, defaultValue)
            is Boolean -> sharedPreferences.getBoolean(property.name, defaultValue)
            is Long -> sharedPreferences.getLong(property.name, defaultValue)
            else -> throw IllegalArgumentException("This type can't be saved into Preferences")
        } as T
    }

    override fun setValue(thisRef: Any, property: KProperty<*>, value: T) {
        when (value) {
            is String -> sharedPreferences.edit().putString(property.name, value).apply()
            is Int -> sharedPreferences.edit().putInt(property.name, value).apply()
            is Boolean -> sharedPreferences.edit().putBoolean(property.name, value).apply()
            is Long -> sharedPreferences.edit().putLong(property.name, value).apply()
            else -> throw IllegalArgumentException("This type can't be saved into Preferences")
        }
    }
}

fun <T : Any> SharedPreferences.preference(
    defaultValue: T
): ReadWriteProperty<Any, T> =
    PreferenceDelegate(this, defaultValue)
