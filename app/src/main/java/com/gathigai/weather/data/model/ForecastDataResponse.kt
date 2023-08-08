package com.gathigai.weather.data.model

import com.google.gson.annotations.SerializedName

data class ForecastDataResponse(
    @field:SerializedName("cod") var cod: String? = null,
    @field:SerializedName("message") var message: Int? = null,
    @field:SerializedName("cnt") var noOfTimestamps: Int? = null,
    @field:SerializedName("list") var list: ArrayList<LocationDataResponse> = arrayListOf(),
    @field:SerializedName("city") var cityContainer: CityContainer? = null
)