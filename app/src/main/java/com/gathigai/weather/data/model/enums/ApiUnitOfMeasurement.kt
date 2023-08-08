package com.gathigai.weather.data.model.enums

enum class ApiUnitOfMeasurement(val value: String) {
    STANDARD("standard"),
    METRIC("metric"),
    IMPERIAL("imperial");

    override fun toString(): String {
        return this.value;
    }
}