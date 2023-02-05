package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatDelegate
import com.example.myapplication.home.HomeActivity

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_FOLLOW_SYSTEM)  //
    Handler(Looper.getMainLooper())
    .postDelayed({
        // INSIDE RUN METHOD
        startQuranActivity();
    }, 2000)
}

fun startQuranActivity() {
    val intent = Intent(
        this,
        HomeActivity::class.java
    );
    startActivity(intent)
}
}