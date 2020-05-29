/*
 * MIT License
 *
 * Copyright (c) 2020 Mehatab Shaikh
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 *
 */

object Config {
    val compileSdk = 29
    val buildTools = "29.0.3"
    val applicationId = "com.starter"
    val minSdk = 21
    val targetSdk = 29
    val versionCode = 1
    val versionName = "0.0.1"
}

object Versions {
    const val kotlin_version = "1.3.72"
    const val appcompat = "1.1.0"
    const val core_ktx = "1.2.0"
    const val constraintlayout = "2.0.0-beta4"
    const val material = "1.1.0"
    const val fragment = "1.3.0-alpha04"
    const val navigation = "2.3.0-alpha06"
    const val navigation_ui = "2.3.0-alpha06"
    const val espresso = "3.2.0"
    const val test_ext = "1.1.1"
    const val junit = "4.12"
    const val room = "2.2.5"
    const val threetenbp = "1.4.4"
    const val livedata = "2.2.0"
    const val koin = "2.0.1"
    const val preference = "1.1.1"

    const val firebaseAuthVersion = "19.3.1"
    const val firebaseConfigVersion = "19.1.4"
    const val firebaseCoreVersion = "17.4.2"
    const val firebaseFirestoreVersion = "21.4.3"
}

object Deps {
    val kotlin = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:${Versions.kotlin_version}"
    val appcompat = "androidx.appcompat:appcompat:${Versions.appcompat}"
    val core_ktx = "androidx.core:core-ktx:${Versions.core_ktx}"
    val constraintlayout = "androidx.constraintlayout:constraintlayout:${Versions.constraintlayout}"
    val material = "com.google.android.material:material:${Versions.material}"
    val fragment = "androidx.fragment:fragment-ktx:${Versions.fragment}"
    val navigation = "androidx.navigation:navigation-fragment-ktx:${Versions.navigation}"
    val navigation_ui = "androidx.navigation:navigation-ui-ktx:${Versions.navigation_ui}"
    val junit = "junit:junit:${Versions.junit}"
    val test_ext = "androidx.test.ext:junit:${Versions.test_ext}"
    val espresso = "androidx.test.espresso:espresso-core:${Versions.espresso}"
    val koin = "org.koin:koin-android-viewmodel:${Versions.koin}"

    val livedata = "androidx.lifecycle:lifecycle-livedata-ktx:${Versions.livedata}"
    val room = "androidx.room:room-runtime:${Versions.room}"
    val room_compiler = "androidx.room:room-compiler:${Versions.room}"
    val room_ktx = "androidx.room:room-ktx:${Versions.room}"
    val threetenbp = "org.threeten:threetenbp:${Versions.threetenbp}"
}