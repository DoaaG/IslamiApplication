package com.example.myapplication.home.quran

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.databinding.SuarDetailsItemBinding

class SuarDetailsAdapter(var ayatlist: List<String>) :
    RecyclerView.Adapter<SuarDetailsAdapter.ViewHolder>() {
    inner class ViewHolder(val bind: SuarDetailsItemBinding) : RecyclerView.ViewHolder(bind.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val bind =
            SuarDetailsItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(bind)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = ayatlist[position]
        holder.bind.suarDetailsItemtv.text = "${item}(${position + 1})"
    }

    override fun getItemCount(): Int {
        return ayatlist.size
    }
}