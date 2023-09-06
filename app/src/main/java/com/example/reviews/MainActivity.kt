package com.example.reviews

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.reviews.databinding.BeforeMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: BeforeMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = BeforeMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.loginBtn.setOnClickListener {
            val intent = Intent(this, AfterMainActivity::class.java)
            startActivity(intent)
        }

    }

}