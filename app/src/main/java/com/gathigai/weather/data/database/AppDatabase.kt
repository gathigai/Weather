package com.gathigai.weather.data.database

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.gathigai.weather.data.database.entity.CityEntity
import com.gathigai.weather.data.database.entity.WeatherDetailEntity
import com.gathigai.weather.data.model.database.dao.CityDao
import com.gathigai.weather.data.model.database.dao.WeatherDetailDao
import com.gathigai.weather.util.WeatherListConverter

@Database(
    entities = [
        CityEntity::class,
        WeatherDetailEntity::class
    ],
    version = 1,
    exportSchema = true
)
@TypeConverters(
    WeatherListConverter::class
)
abstract class AppDatabase: RoomDatabase(){
    abstract fun cityDao(): CityDao
    abstract fun weatherDetailDao(): WeatherDetailDao
}