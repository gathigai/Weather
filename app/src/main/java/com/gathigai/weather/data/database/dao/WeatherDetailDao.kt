package com.gathigai.weather.data.model.database.dao

import androidx.room.*
import com.gathigai.weather.data.database.entity.WeatherDetailEntity
import kotlinx.coroutines.flow.Flow

@Dao
interface WeatherDetailDao {

    @Insert
    suspend fun insertWeatherDetail(entities: WeatherDetailEntity): Long

    @Insert
    suspend fun insertWeatherDetails(entities: List<WeatherDetailEntity>): List<Long>

    @Update
    suspend fun updateWeatherDetails(vararg entities: WeatherDetailEntity)

    @Upsert
    suspend fun upsertWeatherDetails(entities: List<WeatherDetailEntity>)

    @Query(value = "SELECT * FROM weather_details")
    fun getWeatherDetails(): Flow<List<WeatherDetailEntity>>

    @Query(value = "SELECT * FROM weather_details WHERE is_current = true")
    fun getCurrentWeatherDetails(): Flow<WeatherDetailEntity>

    @Query(value = """ 
        SELECT * FROM weather_details WHERE city_id = :cityId AND is_current = :isCurrent
    """)
    fun getWeatherDetailsByCityAndCurrent(cityId: Long, isCurrent: Boolean): Flow<List<WeatherDetailEntity>>

    @Query(
        value = "DELETE FROM weather_details WHERE is_current = true"
    )
    suspend fun deleteCurrentWeatherDetails()

    @Query(
        value = """
            DELETE FROM weather_details WHERE id in (:ids)
        """)
    suspend fun deleteWeatherDetails(vararg ids: String)

    @Query(
        value = """
            DELETE FROM weather_details WHERE city_id = :cityId
        """)
    suspend fun deleteWeatherDetailsByCityId( cityId: Long)
}