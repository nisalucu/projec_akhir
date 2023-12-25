package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class profile : AppCompatActivity() {

    private lateinit var edit_profil: TextView
    private lateinit var logout: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile )

        edit_profil = findViewById(R.id.editprfil)
        logout = findViewById(R.id.idlogout)

        edit_profil.setOnClickListener {
            val move = Intent(this@profile, editprofil::class.java)
            startActivity(move)
        }
        logout.setOnClickListener {
            val move = Intent(this@profile, login::class.java)
            startActivity(move)
        }


    }
}