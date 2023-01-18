package com.example.myapplication.home.hadeth

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapplication.Constants
import com.example.myapplication.databinding.ActivityHadethDetailsBinding

class HadethDetailsActivity : AppCompatActivity() {
    lateinit var binding: ActivityHadethDetailsBinding
    lateinit var Adapter: HadethDetailsAdapter
    lateinit var lengthofhadethlist: HadethAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHadethDetailsBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initviews()
        binding.contentOfCardviewHadeth.hadethDetailsRecycler.adapter = Adapter
    }

    private fun initviews() {
        val hadethnumber = intent.getIntExtra(Constants.Index, -1)
        val adapterlist = readfile()
//        lengthofhadethlist = HadethAdapter(adapterlist.size)
        val hadethlist = readlist(hadethnumber,adapterlist)
//        println("size " + adapterlist.size)
        Adapter = HadethDetailsAdapter(hadethlist)
        binding.backBtn.setOnClickListener {
            finish()
        }

    }

    private fun readlist(hadethnumber: Int, adapterlist: List<String>): String {
        print(adapterlist[hadethnumber])
        return adapterlist[hadethnumber]
    }


    private fun readfile(): List<String> {
        val fileName = "ahadeth .txt"
//        var hadeth = ArrayList<String>()
        val fileContent = assets.open(fileName).bufferedReader().use {
            it.readText()
        }
        return fileContent.split("#") as ArrayList<String>
    }
}
