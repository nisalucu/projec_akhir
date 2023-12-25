package com.example.myapplication

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class kategori : AppCompatActivity() {
    private lateinit var teks_buah : TextView
    private lateinit var teks_hias : TextView
    private lateinit var teks_sayuran : TextView
    private lateinit var teks_obat: TextView
    private  lateinit var btnprofile: ImageView

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kategori)

        teks_buah = findViewById(R.id.buah)
        teks_hias = findViewById(R.id.hias)
        teks_sayuran = findViewById(R.id.sayuran)
        teks_obat = findViewById(R.id.obat)
        btnprofile = findViewById(R.id.prfl)


        teks_buah.setOnClickListener {
            val move = Intent(this@kategori, bibit_buah::class.java)
            startActivity(move)
        }

        teks_hias.setOnClickListener {
            val move = Intent(this@kategori,bibit_hias::class.java)
            startActivity(move)
        }

        teks_sayuran.setOnClickListener {
            val move = Intent(this@kategori,bibit_sayur::class.java)
            startActivity(move)
        }

        teks_obat.setOnClickListener {
            val move = Intent(this@kategori, bibit_obat::class.java)
            startActivity(move)
        }

        btnprofile.setOnClickListener {
            val move = Intent(this@kategori, profile::class.java)
            startActivity(move)
        }
    }
}