package com.gathigai.weather.data.model

import com.google.gson.annotations.SerializedName

data class Main(
    @field:SerializedName("temp") var temperature: Double? = null,
    @field:SerializedName("feels_like") var feelsLike: Double? = null,
    @field:SerializedName("temp_min") var minimumTemperature: Double? = null,
    @field:SerializedName("temp_max") var maximumTemperature: Double? = null,
    @field:SerializedName("pressure") var pressure: Int? = null,
    @field:SerializedName("humidity") var humidity: Int? = null,
    @field:SerializedName("sea_level") var seaLevel: Int? = null,
    @field:SerializedName("grnd_level") var groundLevel: Int? = null,
    @field:SerializedName("temp_kf") var tempKf: Double? = null
)