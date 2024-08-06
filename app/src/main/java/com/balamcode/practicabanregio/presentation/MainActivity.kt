package com.balamcode.practicabanregio.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.balamcode.practicabanregio.R
import com.balamcode.practicabanregio.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}