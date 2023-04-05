package com.weather.a20230405_petertheja_chase.di

import com.weather.a20230405_petertheja_chase.data.location.DefaultLocationTracker
import com.weather.a20230405_petertheja_chase.domain.location.LocationTracker
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

/**
 * Created by peterx.theja on 2023-04-05.
 */
@Module
@InstallIn(SingletonComponent::class)
abstract class LocationModule {

    @Singleton
    @Binds
    abstract fun bindLocationTracker(defaultLocationTracker: DefaultLocationTracker): LocationTracker
}