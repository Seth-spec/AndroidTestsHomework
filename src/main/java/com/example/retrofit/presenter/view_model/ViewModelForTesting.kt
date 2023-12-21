package com.example.retrofit.presenter.view_model

import androidx.lifecycle.ViewModel

class ViewModelForTesting: ViewModel() {

    private var calculateNumber = ""

    fun enterNumber(number: String): String {
        calculateNumber = number
        return calculateNumber
    }

    fun clear(): String {
        calculateNumber = ""
        return calculateNumber
    }

    fun multiplyOperation(): Int {
        return if (calculateNumber.isNotEmpty()) {
            calculateNumber.toInt() * 2
        } else {
            0
        }
    }

}