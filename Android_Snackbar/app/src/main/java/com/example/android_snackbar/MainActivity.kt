package com.example.android_snackbar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.android_snackbar.databinding.ActivityMainBinding
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.basicButton.setOnClickListener {
            Snackbar.make(it, "Basic Snackbar", Snackbar.LENGTH_SHORT).show()
        }

        binding.customButton.setOnClickListener {
            Snackbar.make(it, "Custom Snackbar", Snackbar.LENGTH_SHORT).
                    setAction("OK"){
                        //"OK"버튼을 눌렀을 때 구현할 동작 정의
                        Toast.makeText(applicationContext, "Custom Snackbar Action", Toast.LENGTH_SHORT).show()
                    }.
            show()
        }
    }
}