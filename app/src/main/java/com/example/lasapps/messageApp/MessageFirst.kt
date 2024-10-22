package com.example.lasapps.messageApp

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.lasapps.R

class MessageFirst : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_message_first)

        var textoMensaje1 = findViewById<TextView>(R.id.message1)
        var nombre: String = intent.extras?.getString("extra_name").orEmpty()
        textoMensaje1.text = "Hola $nombre"
    }
}