package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class editprofil : AppCompatActivity() {
private lateinit var btnprofile : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_editprofil)

        btnprofile=findViewById(R.id.update1)

        btnprofile.setOnClickListener {
            val move = Intent(this@editprofil, login::class.java)
            startActivity(move)
        }

    }
}