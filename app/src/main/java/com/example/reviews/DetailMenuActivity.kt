package com.example.reviews

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.reviews.databinding.DetailMenuBinding

class DetailMenuActivity: AppCompatActivity() {

    private lateinit var binding: DetailMenuBinding
    private lateinit var recyclerViewAdapter: DetailMenuReAdaptaer

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DetailMenuBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // 1. RecyclerView 초기화 및 레이아웃 매니저 설정
        binding.recyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false)

        // 2. RecyclerView에 어댑터 연결
        recyclerViewAdapter = DetailMenuReAdaptaer()
        binding.recyclerView.adapter = recyclerViewAdapter

        // 3. 데이터 추가 (예시)
        val detailMenuReItems = mutableListOf<DetailMenuReItem>()

        for(i in 1 until 10) {
            detailMenuReItems.add(DetailMenuReItem(
                "닉네임$i", "${i}단계 맵크나이트", "소식가", "미식가",
                "★☆☆☆☆", "★★★★☆", "★★☆☆☆", "없음"
            ))
        }

        detailMenuReItems.add(DetailMenuReItem(
            "닉네임", "7단계 맵크나이트", "소식가", "미식가",
            "★☆☆☆☆", "★★★★☆", "★★☆☆☆", "없음"
        ))

        recyclerViewAdapter.submitList(detailMenuReItems)

    }

}