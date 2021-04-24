package com.example.nickforler1109405final

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import com.example.nickforler1109405final.databinding.ActivityViewBucketBinding
import androidx.lifecycle.Observer
import androidx.activity.viewModels

class ViewBucketActivity : AppCompatActivity() {
    private lateinit var binding: ActivityViewBucketBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityViewBucketBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.floatingActionButton.setOnClickListener {
            var intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        val model : ListViewModel by viewModels()
        model.getListing().observe(this, Observer<List<BucketList>>{ bucket->
            var bucketView = BucketViewAdapter(this, bucket)
            binding.tableLayout.adapter = bucketView
        })
    }
}