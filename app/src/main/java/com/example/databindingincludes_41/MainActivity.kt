package com.example.databindingincludes_41

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.databindingincludes_41.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val user = User("Ruslan", "Ibragimov", 39, true)
        binding.user = user
    }
}