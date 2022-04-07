package com.example.zadanie0704

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btn = findViewById<Button>(R.id.button)
        val iv = findViewById<ImageView>(R.id.imageView)
        var x = 1
        btn.setOnClickListener {
            if (x == 1) {
                iv.setImageResource(R.drawable.img1)
                x = 0
            }
            else if (x == 0) {
                iv.setImageResource(R.drawable.img2)
                x = 1
            }
        }
    }
}