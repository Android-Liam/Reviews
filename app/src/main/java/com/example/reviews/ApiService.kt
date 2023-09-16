package com.example.reviews

import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.POST

interface ApiService {
    @POST("/api/data")
    fun sendData(@Body data: SendRegisterDataClass): Call<ResponseClass>
}