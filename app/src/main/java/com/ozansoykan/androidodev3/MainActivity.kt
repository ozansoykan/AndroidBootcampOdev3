package com.ozansoykan.androidodev3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.ozansoykan.androidodev3.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var image : ImageView
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        var view = binding.root
        setContentView(view)
        image = binding.imageView

        binding.button.setOnClickListener {
                image.setImageResource(R.drawable.gs_takimi1)
        }

    }
}