package com.sgkang.androidessential_toast

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.widget.Toast
import com.sgkang.androidessential_toast.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.sendButton.setOnClickListener {
            val text = "${binding.editText.text}"
            val intent = Intent(this, SubActivity::class.java)
            intent.putExtra("data", text)
            startActivity(intent)
        }
    }
}