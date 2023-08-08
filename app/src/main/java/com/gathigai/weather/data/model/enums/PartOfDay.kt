package com.gathigai.weather.data.model.enums

enum class PartOfDay(val value: String) {
    DAY("d"),
    NIGHT("n");

    override fun toString(): String {
        return this.value;
    }
}