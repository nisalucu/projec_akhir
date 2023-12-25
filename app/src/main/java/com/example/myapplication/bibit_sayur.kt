package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class bibit_sayur : AppCompatActivity() {


    private lateinit var hlmcabe: TextView
    private lateinit var hlmTomat: TextView
    private lateinit var hlmterong: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bibit_sayur)

        hlmTomat = findViewById(R.id.txt_tmt)
        hlmterong = findViewById(R.id.txt_trg)
        hlmcabe = findViewById(R.id.txt_cabe)

        hlmTomat.setOnClickListener {
            val move = Intent(this@bibit_sayur, hlm_tomat::class.java)
            startActivity(move)
        }
        hlmterong.setOnClickListener {
            val move = Intent(this@bibit_sayur, hlm_terong::class.java)
            startActivity(move)
        }
        hlmcabe.setOnClickListener {
            val move = Intent(this@bibit_sayur, hlm_cabe::class.java)
            startActivity(move)
        }
    }
}