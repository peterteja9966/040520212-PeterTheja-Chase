package com.weather.a20230405_petertheja_chase.di

import com.weather.a20230405_petertheja_chase.data.remote.WeathrAPI
import com.weather.a20230405_petertheja_chase.domain.util.Constants
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import retrofit2.create
import javax.inject.Singleton

/**
 * Created by peterx.theja on 2023-04-05.
 */
@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun ProvideWeatherApi(): WeathrAPI {
        return Retrofit.Builder().baseUrl(Constants.BASE_URL)
            .addConverterFactory(MoshiConverterFactory.create())
            .build()
            .create()
    }
}