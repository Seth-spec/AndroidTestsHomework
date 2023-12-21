package com.example.retrofit.domain.repository

import com.example.retrofit.presenter.model.CarResponse
import com.example.retrofit.presenter.model.UserModel
import com.example.retrofit.presenter.model.UserResponse
import retrofit2.Response

interface CarRepository {

    suspend fun register(user: UserModel): Response<UserResponse>

    suspend fun getCarById(id: Int): Response<CarResponse>
}