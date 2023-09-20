package com.example.reviews

import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.POST

/*
* App -> Server
* 서버에 데이터 전송을 위한 코드
*/
interface ApiService {
    @POST("/api/data")
    fun sendData(@Body data: SendRegisterDataClass): Call<ResponseClass>
}