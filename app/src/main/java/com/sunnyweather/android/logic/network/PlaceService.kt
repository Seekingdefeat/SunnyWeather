package com.sunnyweather.android.logic.network

import com.sunnyweather.android.SunnyWeatherApplication
import com.sunnyweather.android.logic.model.PlaceResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface PlaceService {

    // 调用searchPlaces()方法的时候，Retrofit就会发起一条get请求，去访问注解中配置的地址
    @GET("v2/place?token=${SunnyWeatherApplication.TOKEN}&lang=zh_CN")
    // 搜索城市数据的api中只有query参数需要动态指定，使用query注解进行实现，另外两个参数不会改变，故固定写在注解中
    fun searchPlaces(@Query("query") query: String) : Call<PlaceResponse>
}