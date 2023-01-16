package com.example.myapplication.home.quran

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapplication.Constants
import com.example.myapplication.databinding.ActivitySuarDetailsBinding

class SuarDetailsActivity : AppCompatActivity() {
    lateinit var detailsBinding: ActivitySuarDetailsBinding
    lateinit var Adapter: SuarDetailsAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        detailsBinding = ActivitySuarDetailsBinding.inflate(layoutInflater)
        setContentView(detailsBinding.root)
        initView()
        detailsBinding.contentOfCardview.suarDetailsRecycler.adapter = Adapter

    }

    private fun initView() {
        val index = intent.getIntExtra(Constants.Index, -1)
        val suraname = intent.getStringExtra(Constants.Sura_name)
//        detailsBinding.suraNametvOfAppbar.text = "سورة " + suraname
        detailsBinding.contentOfCardview.suraNametvOfAppbar.text = "سورة " + suraname
        val ayat = readSuraFile(index)
        Adapter = SuarDetailsAdapter(ayat)
        detailsBinding.backBtn.setOnClickListener {
            finish()  // end activity cycle
        }

    }


    private fun readSuraFile(index: Int): List<String> {
        val fileName = "" + (index + 1) + ".txt"
        val fileContent = assets.open(fileName).bufferedReader().use {
            it.readText()
        }
        return fileContent.split("\n")

    }
}