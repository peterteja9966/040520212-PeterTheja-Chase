package com.weather.a20230405_petertheja_chase.data.remote;

import io.reactivex.rxjava3.core.Observable;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by peterx.theja on 2023-04-05.
 */
public interface WeathrAPI {
    @GET("weather")
    Observable<WeatherData> getWeather(
            @Query("appid") String apiKey,
            @Query("lon") String lon,
            @Query("lat") String lat);

}
