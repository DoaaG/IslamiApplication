package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import com.example.myapplication.home.HomeActivity

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
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