package com.gathigai.weather.data.model

import com.google.gson.annotations.SerializedName

data class Coordinates(
    @field:SerializedName("lon") var longitude: String? = null,
    @field:SerializedName("lat") var latitude: String? = null
)