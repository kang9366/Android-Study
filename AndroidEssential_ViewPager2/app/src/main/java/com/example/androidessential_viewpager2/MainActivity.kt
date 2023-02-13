package com.example.androidessential_viewpager2

import FirstFragment
import SecondFragment
import ThirdFragment
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.viewpager.widget.ViewPager
import androidx.viewpager2.widget.ViewPager2
import com.example.androidessential_viewpager2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var viewPager2Adapter = ViewPager2Adapter(this)

        viewPager2Adapter.addFragment(FirstFragment())
        viewPager2Adapter.addFragment(SecondFragment())
        viewPager2Adapter.addFragment(ThirdFragment())

        binding.viewpager.apply {
            adapter = viewPager2Adapter
            registerOnPageChangeCallback(object : ViewPager2.OnPageChangeCallback(){
                override fun onPageSelected(position: Int) {
                    super.onPageSelected(position)
                }
            })
        }
    }
}