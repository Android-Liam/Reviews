package com.example.reviews

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.reviews.databinding.AfterMainBinding
import com.example.reviews.databinding.SelectingCategoryBinding

class SelectCategoryActivity: AppCompatActivity() {

    private lateinit var binding: SelectingCategoryBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = SelectingCategoryBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }

    fun onLinearLayoutClick(view: View) {
        // 클릭 이벤트를 처리하는 코드를 여기에 작성합니다.
        when (view.id) {
            binding.categorySelect1.id -> {
                Log.d("Log", "First Category")
            }
            binding.categorySelect2.id -> {
                Log.d("Log", "Second Category")
            }
            binding.categorySelect3.id -> {
                Log.d("Log", "Third Category")
            }
            else -> {
                Log.d("Log", "None")
            }
        }
    }
}