package com.example.retrofit.domain.use_cases

import com.example.retrofit.domain.repository.CarRepository
import com.example.retrofit.presenter.model.CarResponse
import retrofit2.Response
import javax.inject.Inject

class GetCarByIdUseCase @Inject constructor(
    private val repository: CarRepository
) {

    suspend fun execute(id: Int): Response<CarResponse> {
        return repository.getCarById(id)
    }

}