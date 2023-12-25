package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class bibit_buah : AppCompatActivity() {
    private lateinit var hlmpisang: TextView
    private lateinit var hlmjeruk: TextView
    private lateinit var hlmpepaya:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bibit_buah)

        hlmpisang = findViewById(R.id.txt_psng)
        hlmjeruk = findViewById(R.id.txt_jrk)
        hlmpepaya = findViewById(R.id.txt_ppy)

        hlmpisang.setOnClickListener {
            val move = Intent(this@bibit_buah, hlm_psng::class.java)
            startActivity(move)
        }
        hlmjeruk.setOnClickListener {
            val move = Intent(this@bibit_buah, hlm_jeruk::class.java)
            startActivity(move)
        }
        hlmpepaya.setOnClickListener {
            val move = Intent(this@bibit_buah, hlm_pepaya::class.java)
            startActivity(move)
        }
    }
}