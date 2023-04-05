package com.weather.a20230405_petertheja_chase.domain.location

import android.location.Location

/**
 * Created by peterx.theja on 2023-04-05.
 */
interface LocationTracker {
    suspend fun getCurrentLocation(): Location?
}