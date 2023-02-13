package com.example.androidessential_viewpager2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewbinding.ViewBinding
import com.example.androidessential_viewpager2.databinding.FragmentFirstTabBinding

class FirstTab : Fragment() {
    private lateinit var binding: FragmentFirstTabBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentFirstTabBinding.inflate(inflater, container, false)
        return binding.root
    }
}