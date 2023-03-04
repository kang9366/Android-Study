package com.sgkang.jetpack_databinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.sgkang.jetpack_databinding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    var name: String? = null
    var age: String? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(
            this,
            R.layout.activity_main
        )
        binding.mainActivity = this

        val user: User = User("kang", 25)
        binding.user = user

    }

    fun onClick(name: String){
        Toast.makeText(this, "$name is clicked", Toast.LENGTH_SHORT).show()
    }

    fun setData(){
        name = binding.name.text.toString()
        age = binding.age.text.toString()
    }
}