package com.example.lap01

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity_1d : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_1d)

        //sk link Forget Password
        findViewById<TextView>(R.id.txtLinkForgot).setOnClickListener {
            val intent = Intent(this, MainActivity_1b::class.java)
            startActivity(intent)
        }
    }
}