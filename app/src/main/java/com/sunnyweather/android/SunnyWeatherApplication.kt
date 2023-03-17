package com.sunnyweather.android

import android.annotation.SuppressLint
import android.app.Application
import android.content.Context
//在AndroidManifest的application设置就能全局获取Context对象
class SunnyWeatherApplication:Application() {
    companion object{
        @SuppressLint("StaticFieldLeak")
        lateinit var context:Context
        const val TOKEN="F8cSleHN4UfiNgsJ"
    }

    override fun onCreate() {
        super.onCreate()
        context=applicationContext
    }
}