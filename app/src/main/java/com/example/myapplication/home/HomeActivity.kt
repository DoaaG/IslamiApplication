package com.example.myapplication.home

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.myapplication.R
import com.example.myapplication.databinding.ActivityHomeBinding
import com.example.myapplication.home.quran.QuranFragment

class HomeActivity : AppCompatActivity() {
    lateinit var binding: ActivityHomeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initViews()
        binding.content.homeBottomNavigation.selectedItemId = R.id.nav_quran
    }

    private fun initViews() {
        binding.content.homeBottomNavigation.setOnItemSelectedListener {
            if (it.itemId ==R.id.nav_quran) {
                showFragment(QuranFragment())}

//            } else if (it.itemId == R.id.nav_hadeth) {
//                showFragment(HadethFragment())
//
//            } else if (it.itemId == R.id.nav_radio) {
//                showFragment(RadioFragment())
//
//            } else if (it.itemId == R.id.nav_sebha) {
//                showFragment(SebhaFragment())
//
//            }

            // make item selected
            return@setOnItemSelectedListener true
        }
    }

    private fun showFragment(fragment: Fragment) {
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.fragment_container, fragment)
            .commit()

    }
}