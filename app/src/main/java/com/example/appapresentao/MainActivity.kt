package com.example.appapresentao

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnForm = findViewById<Button>(R.id.btnContato)
        btnForm.setOnClickListener { startFormActivity() }
    }

    private fun startFormActivity() {
        val intent = Intent(this, FormActivity::class.java)
        startActivity(intent)
    }
}
