package com.weather.a20230405_petertheja_chase.data.remote

import com.squareup.moshi.Json

/**
 * Created by peterx.theja on 2023-04-05.
 */
data class Weather(
    @field:Json(name = "id") val weatherId: Int,
    @field:Json(name = "main") val mainDesc: String,
    @field:Json(name = "description") val description: String
)
