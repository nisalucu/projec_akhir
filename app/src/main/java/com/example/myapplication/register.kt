package com.example.myapplication

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class register : AppCompatActivity() {
    private lateinit var Button_register : Button
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        Button_register = findViewById(R.id.register)

        Button_register.setOnClickListener{
            val move = Intent (this@register, MainActivity::class.java)
            startActivity(move)
        }
    }
}