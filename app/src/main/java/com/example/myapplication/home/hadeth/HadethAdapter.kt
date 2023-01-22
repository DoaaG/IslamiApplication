package com.example.myapplication.home.hadeth

import android.view.LayoutInflater
import android.view.ViewGroup
import com.example.myapplication.databinding.HadethItemBinding

class HadethAdapter(var hadethlist: List<String>) :
    androidx.recyclerview.widget.RecyclerView.Adapter<HadethAdapter.hadethViewHolder>() {
    inner class hadethViewHolder(val binding: HadethItemBinding) :
        androidx.recyclerview.widget.RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): hadethViewHolder {
        val bind = HadethItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return hadethViewHolder(bind)
    }

    override fun getItemCount(): Int {
        return hadethlist.size
    }

    var onHadethClickListener: OnHadethClickListener? = null
    override fun onBindViewHolder(holder: hadethViewHolder, position: Int) {
        holder.binding.hadethTvForRecycler.text = (" الحديث رقم ")+ "${position + 1}"
        holder.binding.hadethTvForRecycler.setOnClickListener {
            onHadethClickListener!!.onitemClick(position,hadethlist)
        }

    }

}
