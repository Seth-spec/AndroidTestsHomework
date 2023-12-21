package com.example.retrofit.domain.use_cases

import com.example.retrofit.domain.repository.CarRepository
import com.example.retrofit.presenter.model.UserModel
import com.example.retrofit.presenter.model.UserResponse
import retrofit2.Response
import javax.inject.Inject

class RegisterUseCase @Inject constructor(
    private val repository: CarRepository
) {

    suspend fun execute(
        user: UserModel
    ): Response<UserResponse> {
        return repository.register(user)
    }
}