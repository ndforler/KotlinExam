package com.example.nickforler1109405final

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.nickforler1109405final.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.addBucketButton.setOnClickListener {
            var intent = Intent(this, NewBucketActivity::class.java)
            startActivity(intent)
        }

        binding.viewBucketButton.setOnClickListener {
            var intent = Intent(this, ViewBucketActivity::class.java)
            startActivity(intent)
        }
    }
}