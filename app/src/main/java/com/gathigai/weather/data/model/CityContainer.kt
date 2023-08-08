package com.gathigai.weather.data.model

import com.google.gson.annotations.SerializedName


data class CityContainer(
    @field:SerializedName("id") var id: Int? = null,
    @field:SerializedName("name") var name: String? = null,
    @field:SerializedName("coord") var coordinates: Coordinates? = null,
    @field:SerializedName("country") var country: String? = null,
    @field:SerializedName("population") var population: Int? = null,
    @field:SerializedName("timezone") var timezone: Int? = null,
    @field:SerializedName("sunrise") var sunrise: Int? = null,
    @field:SerializedName("sunset") var sunset: Int? = null
)