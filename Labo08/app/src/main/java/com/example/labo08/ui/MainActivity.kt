package com.example.labo08.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.labo08.R
import com.example.labo08.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}