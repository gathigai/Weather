package com.gathigai.weather.data.source

interface ForecastDataSource {

    interface LoadSingleLocationDataCallback{
        fun onSingleLocationDataLoaded()
        fun onError(t: Throwable)
    }
}