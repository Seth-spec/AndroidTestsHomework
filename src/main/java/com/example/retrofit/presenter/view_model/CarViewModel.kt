package com.example.retrofit.presenter.view_model

import android.util.Log.d
import androidx.lifecycle.ViewModel
import com.example.retrofit.domain.use_cases.GetCarByIdUseCase
import com.example.retrofit.domain.use_cases.UseCases
import com.example.retrofit.presenter.model.UserModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class CarViewModel @Inject constructor(
    private val useCase: UseCases
) : ViewModel() {

    suspend fun register(user: UserModel) {
        val response = useCase.registerUseCase.execute(user)
        if (response.isSuccessful) {
            d("!!!!!!", response.body()?.firstName ?: "")
        }
    }

    suspend fun getCarById() {
        val response = useCase.getCarByIdUseCase.execute(2014)
        if (response.isSuccessful) {
            d("!!!!!!!!", response.body()?.model ?: "")
            d("!!!!!!!!", (response.body()?.latitude ?: 0.0).toString())
        }
    }
 }