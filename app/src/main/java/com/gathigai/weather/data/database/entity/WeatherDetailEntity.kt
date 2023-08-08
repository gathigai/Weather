package com.gathigai.weather.data.database.entity

import androidx.room.ColumnInfo
import androidx.room.Embedded
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.Index
import androidx.room.PrimaryKey
import com.gathigai.weather.data.model.Clouds
import com.gathigai.weather.data.model.Coordinates
import com.gathigai.weather.data.model.Main
import com.gathigai.weather.data.model.Rain
import com.gathigai.weather.data.model.Snow
import com.gathigai.weather.data.model.Sys
import com.gathigai.weather.data.model.Weather
import com.gathigai.weather.data.model.Wind


@Entity(
        tableName = "weather_details",
        foreignKeys = [
                ForeignKey(
                        entity = CityEntity::class,
                        parentColumns = ["id"],
                        childColumns = ["city_id"],
                        onDelete = ForeignKey.CASCADE
                )
        ],
        indices = [
                Index(value = ["city_id"])
        ]
)
data class WeatherDetailEntity (
        @PrimaryKey(autoGenerate = true)
        val id: Long?=null,
        @ColumnInfo(name = "city_id")
        var cityId: Long?,
        @ColumnInfo(name = "is_current")
        var isCurrent: Boolean = false,
        @Embedded(prefix = "coordinates")
        val coordinates: Coordinates?,
        @ColumnInfo(name = "weathers")
        val weather: ArrayList<Weather> = arrayListOf(),
        val base: String?,
        @Embedded(prefix = "main")
        val main: Main?,
        val visibility: Int?,
        @Embedded(prefix = "wind")
        val wind: Wind?,
        @Embedded(prefix = "rain")
        val rain: Rain?,
        @Embedded(prefix = "snow")
        val snow: Snow?,
        @Embedded(prefix = "clouds")
        val clouds: Clouds?,
        val dataCalculationTime: Int?,
        @Embedded(prefix = "sys")
        val sys: Sys?,
        val timezone: Int?,
        val apiId: Int?,
        val name: String?,
        val cod: Int?
        )