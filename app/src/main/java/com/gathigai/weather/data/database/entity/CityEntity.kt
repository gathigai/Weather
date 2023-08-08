package com.gathigai.weather.data.database.entity

import androidx.room.ColumnInfo
import androidx.room.Embedded
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.gathigai.weather.data.model.City
import com.gathigai.weather.data.model.Coordinates

@Entity(tableName = "cities")
data class CityEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Long? = null,
    val isFavourite: Boolean?,
    @ColumnInfo(name = "is_current")
    val isCurrent: Boolean?,
    val apiId: Int?,
    val name: String?,
    @Embedded(prefix = "city")
    val coordinates: Coordinates?,
    val country: String?,
    val population: Int?,
    val timezone: Int?,
    val sunrise: Int?,
    val sunset: Int?
)

fun CityEntity.asDomainModel() = City(
    id = id,
    isFavourite = isFavourite,
    isCurrent = isCurrent,
    name = name,
    coordinates = coordinates,
    country = country,
    timezone = timezone,
    sunrise = sunrise,
    sunset = sunset
)