package com.sgkang.androidessential_fragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initFragment()
    }

    fun initFragment(){
        val navigationView = findViewById<BottomNavigationView>(R.id.navigationView)
        navigationView.run {
            setOnItemSelectedListener { item ->
                when(item.itemId){
                    R.id.search -> {
                        changeFragment(SearchFragment())
                        return@setOnItemSelectedListener true
                    }
                    R.id.play -> {
                        changeFragment(PlayFragment())
                        return@setOnItemSelectedListener true
                    }
                    R.id.heart -> {
                        changeFragment(HeartFragment())
                        return@setOnItemSelectedListener true
                    }
                    else -> return@setOnItemSelectedListener false
                }
            }
        }
    }

    fun changeFragment  (fragment: Fragment){
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.frameView, fragment)
            .commit()
    }
}