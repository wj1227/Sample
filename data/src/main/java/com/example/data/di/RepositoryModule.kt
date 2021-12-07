package com.example.data.di

import com.example.data.AirQualityRepositoryImpl
import com.example.data.BigDataRepositoryImpl
import com.example.data.remote.AirQualityRemoteDataSource
import com.example.data.remote.BigDataRemoteDataSource
import com.example.domain.repository.AirQualityRepository
import com.example.domain.repository.BigDataRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RepositoryModule {

    @Provides
    @Singleton
    fun provideAirQuailtyRepository(airQualityRemoteDataSource: AirQualityRemoteDataSource): AirQualityRepository {
        return AirQualityRepositoryImpl(airQualityRemoteDataSource)
    }

    @Provides
    @Singleton
    fun provideBigDataRepository(bigDataRemoteDataSource: BigDataRemoteDataSource): BigDataRepository {
        return BigDataRepositoryImpl(bigDataRemoteDataSource)
    }

}