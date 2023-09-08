package com.example.reviews

import android.util.Log

data class DetailMenuReItem(
    val userName: String, val userDefaultSpicy: String, val userDefaultAmount: String, val userDefaultGourmet: String,
    val spicy: String, val amount: String, val rating: String, val repurchaseIntention: String,
)

// Item CLickEvent
fun onItemClick(item: DetailMenuReItem) {
    // item.name -> detali page로 이동
    Log.d("Log", "$item.name")
}