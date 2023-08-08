package com.gathigai.weather.data.model

import com.google.gson.annotations.SerializedName

data class Wind(
    @field:SerializedName("speed") var speed: Double? = null,
    @field:SerializedName("deg") var degrees: Int? = null,
    @field:SerializedName("gust") var gust: Double? = null
)