package com.weather.a20230405_petertheja_chase.data.repository.remote;

import com.weather.a20230405_petertheja_chase.BuildConfig;
import com.weather.a20230405_petertheja_chase.data.remote.WeatherData;
import com.weather.a20230405_petertheja_chase.data.remote.WeatherReq;
import com.weather.a20230405_petertheja_chase.data.remote.WeathrAPI;
import com.weather.a20230405_petertheja_chase.domain.repository.remote.RemoteRepository;

import io.reactivex.rxjava3.core.Observable;

/**
 * Created by peterx.theja on 2023-04-05.
 */
public class RemoteRepositoryImpl implements RemoteRepository {

    public WeathrAPI weatherAPI;

    public RemoteRepositoryImpl(WeathrAPI weatherAPI) {
        this.weatherAPI = weatherAPI;
    }

    @Override
    public Observable<WeatherData> getWeather(WeatherReq req) {
        return weatherAPI.getWeather(BuildConfig.API_KEY,
                req.getLat(),
                req.getLon());
    }

}
