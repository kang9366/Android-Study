package com.sgkang.androidessential_toast

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.sgkang.androidessential_toast.databinding.ActivitySubBinding

class SubActivity : AppCompatActivity() {
    lateinit var binding: ActivitySubBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivitySubBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        val text = intent.getStringExtra("data")
        binding.textView.text = text
    }
}