package com.example.reviews

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.reviews.databinding.AfterMainBinding

class AfterMainActivity: AppCompatActivity() {

    private lateinit var binding: AfterMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = AfterMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }

}