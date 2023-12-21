package com.example.retrofit.presenter.model

data class CarResponse(
    val id: Int? = null,
    val brand: String? = null,
    val model: String? = null,
    val year: Int? = null,
    val imageUrl1: String? = null,
    val imageUrl2: String? = null,
    val imageUrl3: String? = null,
    val image1: Any? = null,
    val image2: Any? = null,
    val image3: Any? = null,
    val price: Int? = null,
    val multiplier: Int? = null,
    val capacity: Int? = null,
    val transmission: String? = null,
    val createdBy: String? = null,
    val createdByEmail: Any? = null,
    val fuelCapacity: Int? = null,
    val city: String? = null,
    val latitude: Double? = null,
    val longitude: Double? = null,
    val ownerPhoneNumber: Any? = null
)
