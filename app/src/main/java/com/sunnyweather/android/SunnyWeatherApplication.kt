package com.sunnyweather.android

import android.annotation.SuppressLint
import android.app.Application
import android.content.Context

// 任意位置可以通过调用SunnyWeatherApplication.context 来获取 context对象

class SunnyWeatherApplication : Application(){

    companion object {
        @SuppressLint("StaticFieldLeak")
        lateinit var context: Context

        const val TOKEN = "填入你申请到的令牌值"
    }

    override fun onCreate() {
        super.onCreate()
        context = applicationContext
    }
}