package com.gathigai.weather.data.model

import com.gathigai.weather.data.model.enums.PartOfDay
import com.google.gson.annotations.SerializedName

data class Sys(
    @field:SerializedName("type") var type: Int? = null,
    @field:SerializedName("id") var id: Int? = null,
    @field:SerializedName("country") var country: String? = null,
    @field:SerializedName("sunrise") var sunrise: Int? = null,
    @field:SerializedName("sunset") var sunset: Int? = null,
    @field:SerializedName("pod") var pod: PartOfDay? = null
)