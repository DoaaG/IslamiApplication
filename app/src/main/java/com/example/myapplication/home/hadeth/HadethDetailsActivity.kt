package com.example.myapplication.home.hadeth

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapplication.Constants
import com.example.myapplication.databinding.ActivityHadethDetailsBinding

class HadethDetailsActivity : AppCompatActivity() {
    lateinit var binding: ActivityHadethDetailsBinding
    lateinit var Adapter: HadethDetailsAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHadethDetailsBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initviews()
        binding.contentOfCardviewHadeth.hadethDetailsRecycler.adapter = Adapter
    }

    private fun initviews() {
        var hadethitem = intent.getStringExtra(Constants.Hadeth_Details)
        Adapter = HadethDetailsAdapter(hadethitem)
        binding.backBtn.setOnClickListener {
            finish()
        }

    }
}