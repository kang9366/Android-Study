package com.sgkang.androidessential_permission

import android.content.pm.PackageManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import com.sgkang.androidessential_permission.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.location.setOnClickListener {
            ActivityCompat.requestPermissions(
                this,
                arrayOf<String>("android.permission.ACCESS_FINE_LOCATION"),
                105
            )
        }

        binding.locationCheck.setOnClickListener {
            val status = ContextCompat.checkSelfPermission(
                this,
                "android.permission.ACCESS_FINE_LOCATION"
            )
            if(status== PackageManager.PERMISSION_GRANTED){
                Toast.makeText(this, "grated", Toast.LENGTH_LONG).show()
            }else{
                Toast.makeText(this, "denied", Toast.LENGTH_LONG).show()
            }
        }
    }
}