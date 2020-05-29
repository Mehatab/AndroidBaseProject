package com.starter.data.preference

import android.content.Context
import android.content.Context.MODE_PRIVATE

class PreferenceHelper(
    context: Context,
    sharedPrefName: String = context.applicationInfo.packageName
) {
    private val sharedPreferences = context.getSharedPreferences(sharedPrefName, MODE_PRIVATE)

    var message: String by sharedPreferences.preference("Hello World!")

}
