package com.example.myapplication.home.hadeth

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView.Adapter
import com.example.myapplication.databinding.HadethItemBinding

class HadethDetailsAdapter(var hadethlist: List<String>): Adapter<HadethDetailsAdapter.ViewHolder>() {
    inner class ViewHolder(val binding: HadethItemBinding) :
        androidx.recyclerview.widget.RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val bind = HadethItemBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return ViewHolder(bind)
    }

    override fun getItemCount(): Int {
    return hadethlist.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
     val item = hadethlist[position]
        holder.binding.hadethTvForRecycler.text = item
    }

}
