package com.gathigai.weather.data.model

import com.google.gson.annotations.SerializedName

data class Clouds(
    @field:SerializedName("all") var all: Int? = null
)