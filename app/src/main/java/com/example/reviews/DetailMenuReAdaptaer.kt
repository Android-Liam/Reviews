package com.example.reviews

import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.reviews.databinding.DetailMenuItemBinding

// 5. RecyclerView 어댑터 클래스 정의
class DetailMenuReAdaptaer : ListAdapter<DetailMenuReItem, DetailMenuReAdaptaer.ViewHolder>(DiffCallback()) {

    // 6. 아이템 뷰를 생성하고 뷰 홀더 반환
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = DetailMenuItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    // 7. 아이템 데이터를 뷰 홀더에 바인딩
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val currentItem = getItem(position)
        holder.bind(currentItem)

        // Item을 클릭 할 시 ClickEvent
        holder.itemView.setOnClickListener {
            // 아이템 클릭 시 처리할 작업을 여기에 추가
            Log.d("RecyclerView", "Item clicked: ${currentItem.userName}")
        }
    }

    // 8. 뷰 홀더 클래스 정의
    class ViewHolder(private val binding: DetailMenuItemBinding) : RecyclerView.ViewHolder(binding.root) {

        fun bind(DetailMenuReItem: DetailMenuReItem) {
            binding.userNameTV.text = DetailMenuReItem.userName
            binding.userDefaultSpicyTV.text = DetailMenuReItem.userDefaultSpicy
            binding.userDefaultAmountTV.text = DetailMenuReItem.userDefaultAmount
            binding.userDefaultGourmetTV.text = DetailMenuReItem.userDefaultGourmet

            binding.spicyTV.text = DetailMenuReItem.spicy
            binding.amountTV.text = DetailMenuReItem.amount
            binding.ratingTV.text = DetailMenuReItem.rating
            binding.repurchaseIntentionTV.text = DetailMenuReItem.repurchaseIntention
        }
    }

    // 10. 아이템 갱신을 위한 콜백 클래스 정의
    private class DiffCallback : DiffUtil.ItemCallback<DetailMenuReItem>() {

        override fun areItemsTheSame(oldDetailMenuReItem: DetailMenuReItem, newDetailMenuReItem: DetailMenuReItem): Boolean {
            // 아이템이 같은지 여부를 확인
            return oldDetailMenuReItem == newDetailMenuReItem
        }

        override fun areContentsTheSame(oldDetailMenuReItem: DetailMenuReItem, newDetailMenuReItem: DetailMenuReItem): Boolean {
            // 아이템 내용이 같은지 여부를 확인
            return oldDetailMenuReItem == newDetailMenuReItem
        }
    }
}