package com.example.lasapps

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.lasapps.helloApp.HelloActivity
import com.example.lasapps.helloApp.MainActivity
import com.example.lasapps.imcApp.ImcActivity
import com.example.lasapps.messageApp.MessageActivity

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        var btnHelloApp = findViewById<Button>(R.id.btnHelloApp)
        var btnMessageApp = findViewById<Button>(R.id.btnMessageApp)
        var btnImcApp = findViewById<Button>(R.id.btnImcApp)


        btnHelloApp.setOnClickListener { navigateToHelloApp() }
        btnMessageApp.setOnClickListener{ navigateToMessageApp() }
        btnImcApp.setOnClickListener{ navigateToImcApp() }
    }

    private fun navigateToImcApp() {
        var intent = Intent(this,ImcActivity::class.java)
        startActivity(intent)
    }

    private fun navigateToMessageApp() {
        var intent = Intent(this,MessageActivity::class.java)
        startActivity(intent)
    }

    private fun navigateToHelloApp() {
        var intent = Intent(this,HelloActivity::class.java)
        startActivity(intent)
    }

}