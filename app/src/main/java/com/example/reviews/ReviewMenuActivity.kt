package com.example.reviews

import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.reviews.databinding.ReviewMenuBinding

class ReviewMenuActivity: AppCompatActivity() {

    private lateinit var binding: ReviewMenuBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ReviewMenuBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // 요소별로 선택된 인덱스를 저장할 변수들
        var selectedSpicyIndex: Int = -1
        var selectedAmountIndex: Int = -1
        var selectedStarIndex: Int = -1

        // 각 요소에 대한 TextView 배열 정의
        val spicyTextViews = arrayOf(
            binding.spicy1, binding.spicy2, binding.spicy3, binding.spicy4, binding.spicy5
        )

        val amountTextViews = arrayOf(
            binding.amount1, binding.amount2, binding.amount3, binding.amount4, binding.amount5
        )

        val starTextViews = arrayOf(
            binding.star1, binding.star2, binding.star3, binding.star4, binding.star5
        )

        // 공통 로직을 수행하는 함수 정의
        fun updateSelectedIndex(selectedIndex: Int, textViewArray: Array<TextView>) {
            for (i in textViewArray.indices) {
                val textView = textViewArray[i]
                textView.text = if (i <= selectedIndex) "★" else "☆"
            }
        }

        // 클릭 리스너 설정
        for (i in spicyTextViews.indices) {
            spicyTextViews[i].setOnClickListener {
                selectedSpicyIndex = i
                updateSelectedIndex(selectedSpicyIndex, spicyTextViews)
            }
        }

        for (i in amountTextViews.indices) {
            amountTextViews[i].setOnClickListener {
                selectedAmountIndex = i
                updateSelectedIndex(selectedAmountIndex, amountTextViews)
            }
        }

        for (i in starTextViews.indices) {
            starTextViews[i].setOnClickListener {
                selectedStarIndex = i
                updateSelectedIndex(selectedStarIndex, starTextViews)
            }
        }



    }
}