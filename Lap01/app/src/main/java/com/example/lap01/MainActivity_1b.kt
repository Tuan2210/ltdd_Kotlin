package com.example.lap01

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity_1b : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_1b)

        //sk nút next
        findViewById<Button>(R.id.btnNext).setOnClickListener {
            val intent = Intent(this, MainActivity_1c::class.java)
            startActivity(intent)
        }
    }
}