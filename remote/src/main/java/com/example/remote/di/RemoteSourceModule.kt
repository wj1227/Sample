package com.example.remote.di

import com.example.data.remote.AirQualityRemoteDataSource
import com.example.data.remote.BigDataRemoteDataSource
import com.example.remote.AirQualityRemoteDataSourceImpl
import com.example.remote.BigDataRemoteDataSourceImpl
import com.example.remote.api.AirQualityApi
import com.example.remote.api.BigDataApi
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RemoteSourceModule {

    @Provides
    @Singleton
    fun provideAirQualityRemoteSource(airQualityApi: AirQualityApi): AirQualityRemoteDataSource {
        return AirQualityRemoteDataSourceImpl(airQualityApi)
    }

    @Provides
    @Singleton
    fun provideBigDataRemoteSource(bigDataApi: BigDataApi): BigDataRemoteDataSource {
        return BigDataRemoteDataSourceImpl(bigDataApi)
    }

}