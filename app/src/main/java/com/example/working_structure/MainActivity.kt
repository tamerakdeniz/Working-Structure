package com.example.working_structure

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.working_structure.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonDetail.setOnClickListener{
            val intent = Intent(this@MainActivity, DetailActivity::class.java)
            startActivity(intent)
            intent.putExtra ("message", "Hi, How are you feeling?")
            startActivity(intent)
        }
    }
}