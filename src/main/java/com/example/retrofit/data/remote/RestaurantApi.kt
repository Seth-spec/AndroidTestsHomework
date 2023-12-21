package com.example.retrofit.data.remote

import com.example.retrofit.presenter.model.Restaurant
import retrofit2.Response
import retrofit2.http.GET

interface RestaurantApi {

    @GET("api/Products/GetAll")
    suspend fun getAllProducts(): Response<List<Restaurant>>

}