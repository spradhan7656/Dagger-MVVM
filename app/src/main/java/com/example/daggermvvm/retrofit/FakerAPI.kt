package com.example.daggermvvm.retrofit

import com.example.daggermvvm.models.Products
import retrofit2.Response
import retrofit2.http.GET

interface FakerAPI {

    @GET("/products")
    suspend fun getProducts():Response<List<Products>>
}