package com.weather.a20230405_petertheja_chase.data.remote

import com.squareup.moshi.Json

/**
 * Created by peterx.theja on 2023-04-05.
 */


data class WeatherData(
    @field:Json(name = "main")
    val weatherData: WeatherMetaData,
    val mainWeather: List<Weather>
)
