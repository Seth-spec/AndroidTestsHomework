package com.example.retrofit.data.repositoryImpl

import com.example.retrofit.data.remote.CarApi
import com.example.retrofit.domain.repository.CarRepository
import com.example.retrofit.presenter.model.CarResponse
import com.example.retrofit.presenter.model.UserModel
import com.example.retrofit.presenter.model.UserResponse
import retrofit2.Response
import javax.inject.Inject

class CarRepositoryImpl @Inject constructor(
    private val api: CarApi
) : CarRepository {
    override suspend fun register(
        user: UserModel
    ): Response<UserResponse> = api.register(user)

    override suspend fun getCarById(
        id: Int
    ): Response<CarResponse> = api.getCarById(id)
}