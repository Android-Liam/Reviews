package com.example.reviews

import android.util.Log
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

/*
* App -> Server
* 서버에 데이터 전송을 위한 코드
*/

fun sendDataToServer(data: SendRegisterDataClass) {
    val retrofit = Retrofit.Builder()
        .baseUrl("http://172.30.1.48:8080/") // Spring Boot Server URL
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    val apiService = retrofit.create(ApiService::class.java)

    val call = apiService.sendData(data)
    call.enqueue(object : Callback<ResponseClass> {
        override fun onResponse(call: Call<ResponseClass>, response: Response<ResponseClass>) {
            if (response.isSuccessful) {
                val responseData = response.body()
                Log.d("Log", "서버 응답 성공: ${responseData?.message}")
            } else {
                Log.e("Log", "서버 응답 실패")
            }
        }

        override fun onFailure(call: Call<ResponseClass>, t: Throwable) {
            Log.e("Log", "네트워크 요청 실패: ${t.message}")
        }
    })
}