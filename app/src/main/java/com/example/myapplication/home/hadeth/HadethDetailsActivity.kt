package com.example.myapplication.home.hadeth

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.myapplication.databinding.ActivityHadethDetailsBinding
import java.io.File

class HadethDetailsActivity : AppCompatActivity() {
    lateinit var binding: ActivityHadethDetailsBinding
    lateinit var Adapter: HadethDetailsAdapter
    val list = listOf(
        "7",
        "286",
        "200",
        "176",
        "120",
        "165",
        "206",
        "75",
        "129",
        "109",
        "123",
        "111",
        "43",
        "52",
        "99",
        "128",
        "111",
        "110",
        "98",
        "135",
        "112",
        "78",
        "118",
        "64",
        "77",
        "227",
        "93",
        "88",
        "69",
        "60",
        "34",
        "30",
        "73",
        "54",
        "45",
        "83",
        "181",
        "88",
        "75",
        "85",
        "54",
        "53",
        "89",
        "59",
        "37",
        "35",
        "38",
        "29",
        "18",
        "45",
        "60",
        "49",
        "62",
        "55",
        "78",
        "96",
        "29",
        "22",
        "24",
        "13",
        "14",
        "11",
        "11",
        "18",
        "12",
        "12",
        "30",
        "52",
        "52",
        "44",
        "28",
        "28",
        "20",
        "56",
        "40",
        "31",
        "50",
        "40",
        "46",
        "42",
        "29",
        "19",
        "36",
        "25",
        "22",
        "17",
        "19",
        "26",
        "30",
        "20",
        "15",
        "21",
        "11",
        "8",
        "8",
        "19",
        "5",
        "8",
        "8",
        "11",
        "11",
        "8",
        "3",
        "9",
        "5",
        "4",
        "7",
        "3",
        "6",
        "3",
        "5",
        "4",
        "5",
        "6"
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHadethDetailsBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initviews()
        binding.contentOfCardviewHadeth.hadethDetailsRecycler.adapter = Adapter
    }

    private fun initviews() {
        val adapterlist = readfile()
        Adapter = HadethDetailsAdapter(adapterlist)
        binding.backBtn.setOnClickListener {
            finish()
        }

    }

    private fun readfile2(): List<String> {
        var ahadethlist: MutableList<String> = mutableListOf<String>()
        val fileName = "ahadeth .txt"
        val fileContent = assets.open(fileName).bufferedReader().use {
            it.readText()
        }
        var content = fileContent.split("#")
        ahadethlist.add(content.toString())
        System.out.println(content)
        return ahadethlist
    }

    private fun readfile(): List<String> {
        val fileName = "ahadeth .txt"
        val ahadethlist = ArrayList<String>()
        val list = ArrayList<String>()
         assets.open(fileName).bufferedReader().forEachLine {
            ahadethlist.add(it)
             it.split("#")
        }
        return ahadethlist
    }
}
