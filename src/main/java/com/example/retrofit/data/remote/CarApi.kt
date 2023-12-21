package com.example.retrofit.data.remote

import com.example.retrofit.presenter.model.CarResponse
import com.example.retrofit.presenter.model.UserModel
import com.example.retrofit.presenter.model.UserResponse
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path

interface CarApi {

    @POST("api/Users/register")
    suspend fun register(
        @Body user: UserModel
    ): Response<UserResponse>

    @GET("api/Car/{id}")
    suspend fun getCarById(
        @Path("id") id: Int
    ): Response<CarResponse>

}