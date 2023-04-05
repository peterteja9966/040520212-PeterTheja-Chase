package com.weather.a20230405_petertheja_chase.presentation.viewmodels;

import androidx.lifecycle.ViewModel;

import com.weather.a20230405_petertheja_chase.data.remote.WeathrAPI;
import com.weather.a20230405_petertheja_chase.domain.repository.remote.RemoteRepository;

import javax.inject.Inject;

/**
 * Created by peterx.theja on 2023-04-05.
 */
public class WeatherViewModel extends ViewModel {

    @Inject
    RemoteRepository remoteRepository;
    @Inject
    WeathrAPI weatherService;

}
