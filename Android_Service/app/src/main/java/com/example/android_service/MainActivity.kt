package com.example.android_service

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val startButton: Button = findViewById(R.id.start_btn)
        val stopButton: Button = findViewById(R.id.stop_btn)
        val intent: Intent = Intent(this, MusicService::class.java)

        startButton.setOnClickListener {
            startService(intent)
        }

        stopButton.setOnClickListener {
            stopService(intent)
        }
    }
}