package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

private lateinit var hlmjahe: TextView
private lateinit var hlmkunyitt: TextView
private lateinit var hlmserai: TextView

class bibit_obat : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bibit_obat)

        hlmjahe = findViewById(R.id.jahe)
        hlmkunyitt = findViewById(R.id.kunyit)
        hlmserai = findViewById(R.id.serei)

        hlmjahe.setOnClickListener {
            val move = Intent(this@bibit_obat, hlm_jahe::class.java)
            startActivity(move)
        }
        hlmkunyitt.setOnClickListener {
            val move = Intent(this@bibit_obat, hlm_kunyit::class.java)
            startActivity(move)
        }
        hlmserai.setOnClickListener {
            val move = Intent(this@bibit_obat, hlm_serei::class.java)
            startActivity(move)
        }
    }
}