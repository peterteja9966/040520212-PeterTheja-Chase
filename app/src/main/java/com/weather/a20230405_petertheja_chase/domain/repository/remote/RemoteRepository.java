package com.weather.a20230405_petertheja_chase.domain.repository.remote;

import com.weather.a20230405_petertheja_chase.data.remote.WeatherData;
import com.weather.a20230405_petertheja_chase.data.remote.WeatherReq;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;

/**
 * Created by peterx.theja on 2023-04-05.
 */
public interface RemoteRepository {
    public Observable<WeatherData> getWeather(WeatherReq req);
}
