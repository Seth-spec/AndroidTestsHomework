package com.example.retrofit.presenter.model

import com.google.gson.annotations.SerializedName

data class Restaurant(
    val id: Int,
    val name: String,
    val price: Double,
    val nuts: Boolean,
    val image: String,
    @SerializedName("vegeterian")
    val vegetarian: Boolean,
    val spiciness: Int,
    val categoryId: Int
)