package com.example.myapplication.home.quran

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.databinding.SuarItemBinding

class QuranAdapter(var suarlist: List<String>, var suarnumberlist: List<String>) : RecyclerView.Adapter<QuranAdapter.SuarViewHolder>(){
    inner class SuarViewHolder(val binding: SuarItemBinding) : RecyclerView.ViewHolder(binding.root){}

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SuarViewHolder {
        val bind = SuarItemBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return SuarViewHolder(bind)
    }
    var itemclick : OnSuraClickListener? = null
    override fun onBindViewHolder(holder: SuarViewHolder, position: Int) {
        var item = suarlist[position]
        var  number = suarnumberlist[position]

        holder.binding.suarItemNametv.text = item
        holder.binding.suarItemNumbertv.text = number

        holder.binding.suarItemNametv.setOnClickListener {
            itemclick!!.onItemsuraclick(position,item)
        }

    }

    override fun getItemCount():Int{
        return suarlist.size ;suarnumberlist.size
    }
}