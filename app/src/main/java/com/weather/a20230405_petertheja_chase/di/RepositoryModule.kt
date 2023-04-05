package com.weather.a20230405_petertheja_chase.di

import com.weather.a20230405_petertheja_chase.data.repository.remote.RemoteRepositoryImpl
import com.weather.a20230405_petertheja_chase.domain.repository.remote.RemoteRepository
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
abstract class RepositoryModule {

    @Binds
    @Singleton
    abstract fun bindRemoteRepository(remoteRepositoryImpl: RemoteRepositoryImpl)
            : RemoteRepository
}