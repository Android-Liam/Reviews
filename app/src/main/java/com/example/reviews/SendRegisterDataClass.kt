package com.example.reviews

/*
* App -> Server
* 서버에 데이터 전송을 위한 코드
*/

data class SendRegisterDataClass(
    val name: String,
    val id: String,
    val password: String,
    val passwordCheck: String
)