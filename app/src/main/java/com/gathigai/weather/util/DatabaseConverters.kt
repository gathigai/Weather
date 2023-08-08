package com.gathigai.weather.util

import androidx.room.TypeConverter
import com.gathigai.weather.data.model.Weather
import com.google.gson.Gson


class WeatherListConverter {
    @TypeConverter
    fun stringToWeatherList(data: String?): ArrayList<Weather> {
        if (data == null) {
            return arrayListOf()
        }
        return Gson().fromJson<ArrayList<Weather>>(data)
    }

    @TypeConverter
    fun weatherListToString(value: ArrayList<Weather>?): String? {
        return Gson().toJson(value)
    }
}