package com.example.reviews

import android.util.Log

data class DetailBrandReItem(val name: String, val content: String)

// Item CLickEvent
fun onItemClick(item: DetailBrandReItem) {
    // item.name -> detali page로 이동
    Log.d("Log", "$item.name")
}