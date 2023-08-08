package com.gathigai.weather.data.model

import com.google.gson.annotations.SerializedName

data class Weather(
    @field:SerializedName("id") var id: Int? = null,
    @field:SerializedName("main") var main: String? = null,
    @field:SerializedName("description") var description: String? = null,
    @field:SerializedName("icon") var icon: String? = null
)