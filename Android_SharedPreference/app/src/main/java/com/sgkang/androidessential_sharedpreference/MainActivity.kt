package com.sgkang.androidessential_sharedpreference

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val idText = findViewById<TextView>(R.id.id_text)
        val passwordText = findViewById<TextView>(R.id.password_text)
        val id = findViewById<EditText>(R.id.id)
        val password = findViewById<EditText>(R.id.password)
        val saveButton = findViewById<Button>(R.id.save_button)
        val displayButton = findViewById<Button>(R.id.display_button)

        val sharedPreference = getSharedPreferences("sp", Context.MODE_PRIVATE)


        saveButton.setOnClickListener {
            val editor = sharedPreference.edit().apply {
                putString("id", id.text.toString())
                putString("password", password.text.toString())
                commit()
            }
        }

        displayButton.setOnClickListener {
            idText.setText(sharedPreference.getString("id", "None"))
            passwordText.setText(sharedPreference.getString("password", "None"))
        }
    }
}