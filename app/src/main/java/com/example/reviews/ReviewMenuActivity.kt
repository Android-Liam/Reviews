package com.example.reviews

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.example.reviews.databinding.ReviewMenuBinding

class ReviewMenuActivity: AppCompatActivity() {

    private lateinit var binding: ReviewMenuBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ReviewMenuBinding.inflate(layoutInflater)
        setContentView(binding.root)



    }
}