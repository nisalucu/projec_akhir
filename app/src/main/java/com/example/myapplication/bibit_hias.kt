package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class bibit_hias : AppCompatActivity() {
    private lateinit var hlmmawar: TextView
    private lateinit var hlmmatahari: TextView
    private lateinit var hlmanggrek: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bibit_hias)

        hlmmawar = findViewById(R.id.txt_mwr)
        hlmmatahari = findViewById(R.id.txt_mthr)
        hlmanggrek = findViewById(R.id.txt_agg)

        hlmmawar.setOnClickListener {
            val move = Intent(this@bibit_hias, hlm_mawar::class.java)
            startActivity(move)
        }
        hlmmatahari.setOnClickListener {
            val move = Intent(this@bibit_hias, hlm_matahari::class.java)
            startActivity(move)
        }
        hlmanggrek.setOnClickListener {
            val move = Intent(this@bibit_hias, hlm_anggrek::class.java)
            startActivity(move)
        }
    }
}