package com.weather.a20230405_petertheja_chase.data.remote

import com.weather.a20230405_petertheja_chase.BuildConfig
import retrofit2.http.GET
import retrofit2.http.Query

/**
 * Created by peterx.theja on 2023-04-05.
 */
interface WeatherApi {
    @GET("/current")
    suspend fun getCurrentWeather(
        @Query("appid") accessKey: String = BuildConfig.API_KEY,
        @Query("lat") lat: String,
        @Query("lon") lon: String
    ): WeatherData

}
