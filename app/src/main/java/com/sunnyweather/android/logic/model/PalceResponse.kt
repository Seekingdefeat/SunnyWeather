package com.sunnyweather.android.logic.model

import android.location.Location
import com.google.gson.annotations.SerializedName

// 完全按照搜索城市接口返回的json格式来定义

data class PlaceResponse(val status: String, val places: List<Place>)

data class Place(val name: String, val location: Location,
            @SerializedName("formatted_address") val address: String) //json字段和kotlin字段建立映射关系

data class Location(val lng: String, val lat: String)