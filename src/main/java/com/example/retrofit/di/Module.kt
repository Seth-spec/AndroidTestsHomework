package com.example.retrofit.di

import com.example.retrofit.data.remote.CarApi
import com.example.retrofit.data.repositoryImpl.CarRepositoryImpl
import com.example.retrofit.domain.repository.CarRepository
import com.example.retrofit.domain.use_cases.GetCarByIdUseCase
import com.example.retrofit.domain.use_cases.RegisterUseCase
import com.example.retrofit.domain.use_cases.UseCases
import com.example.retrofit.utils.Constant
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object Module {

    @Singleton
    @Provides
    fun retrofitBuilder(): Retrofit = Retrofit.Builder()
        .baseUrl(Constant.BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    @Singleton
    @Provides
    fun provideApiService(retrofit: Retrofit): CarApi {
        return retrofit.create(CarApi::class.java)
    }

    @Singleton
    @Provides
    fun provideRepository(api: CarApi): CarRepository {
        return CarRepositoryImpl(api)
    }

    @Singleton
    @Provides
    fun provideUseCases(repository: CarRepository): UseCases {
        return UseCases(
            registerUseCase = RegisterUseCase(repository),
            getCarByIdUseCase = GetCarByIdUseCase(repository)
        )
    }
}