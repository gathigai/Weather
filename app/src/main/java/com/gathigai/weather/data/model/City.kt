package com.gathigai.weather.data.model

import com.gathigai.weather.data.database.entity.CityEntity


data class City(
    val id: Long?,
    val isFavourite: Boolean?,
    val isCurrent: Boolean?,
    val name: String?,
    val coordinates: Coordinates?,
    val country: String?,
    val timezone: Int?,
    val sunrise: Int?,
    val sunset: Int?
)

fun City.asDataModel() = CityEntity(
    isFavourite = isFavourite?:false,
    isCurrent = isCurrent?:false,
    name = name,
    coordinates = coordinates,
    country = country,
    timezone = timezone,
    sunrise = sunrise,
    sunset = sunset,
    apiId = null,
    population = null
)