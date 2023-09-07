package com.example.reviews

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.reviews.databinding.DetailBrandBinding

class DetailBrandActivity: AppCompatActivity() {

    private lateinit var binding: DetailBrandBinding
    private lateinit var recyclerViewAdapter: DetailBrandReAdaptaer

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DetailBrandBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // 1. RecyclerView 초기화 및 레이아웃 매니저 설정
        binding.recyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false)

        // 2. RecyclerView에 어댑터 연결
        recyclerViewAdapter = DetailBrandReAdaptaer()
        binding.recyclerView.adapter = recyclerViewAdapter

        // 3. 데이터 추가 (예시)
        val detailBrandReItems = mutableListOf<DetailBrandReItem>()

        for(i in 1 until 10) {
            detailBrandReItems.add(DetailBrandReItem("Brand Name $i", "평점 평균: 4.3${i}"))
        }

        detailBrandReItems.add(DetailBrandReItem("굽네 치킨", "평점 평균: 4.5"))

        recyclerViewAdapter.submitList(detailBrandReItems)

    }

}