package com.example.reviews

import android.util.Log

data class SelBrandReItem(val name: String, val content: String)

// Item CLickEvent
fun onItemClick(item: SelBrandReItem) {
    // item.name -> detali page로 이동
    Log.d("Log", "$item.name")
}