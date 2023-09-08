package com.example.reviews

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.reviews.databinding.SelectingBrandBinding

class SelBrandActivity : AppCompatActivity(), OnItemClickListener {

    private lateinit var binding: SelectingBrandBinding
    private lateinit var recyclerViewAdapter: SelBrandReAdaptaer

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = SelectingBrandBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // 1. RecyclerView 초기화 및 레이아웃 매니저 설정
        binding.recyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false)

        // 2. RecyclerView에 어댑터 연결
        // RecyclerView 어댑터를 생성할 때 현재 액티비티(this)를 전달합니다.
        recyclerViewAdapter = SelBrandReAdaptaer(this)
        binding.recyclerView.adapter = recyclerViewAdapter

        // 3. 데이터 추가 (예시)
        val SelBrandReItems = mutableListOf<SelBrandReItem>()

        for(i in 1 until 10) {
            SelBrandReItems.add(SelBrandReItem("Brand Name $i", "평점 평균: 4.3${i}"))
        }

        SelBrandReItems.add(SelBrandReItem("굽네 치킨", "평점 평균: 4.5"))

        recyclerViewAdapter.submitList(SelBrandReItems)


    }

    // 아이템 클릭 시 호출될 메서드를 구현합니다.
    override fun onItemClick(item: SelBrandReItem) {
        // 아이템 클릭 시 처리할 작업을 수행하고, 화면을 전환합니다.
        Log.d("RecyclerView", "Item clicked: ${item.name}")
        val intent = Intent(this, DetailBrandActivity::class.java)
        startActivity(intent)
    }

}