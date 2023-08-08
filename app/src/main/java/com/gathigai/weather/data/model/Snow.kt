package com.gathigai.weather.data.model

import com.google.gson.annotations.SerializedName

data class Snow(
    @field:SerializedName("1h") var lastOneHour: Double? = null,
    @field:SerializedName("3h") var lastThreeHours: Double? = null
)