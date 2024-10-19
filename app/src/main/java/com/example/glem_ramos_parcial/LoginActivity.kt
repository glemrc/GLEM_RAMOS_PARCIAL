package com.example.glem_ramos_parcial

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.snackbar.Snackbar

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_login)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val emailSucces: String = "admin@toolkitapp.com"
        val passwordSucces: String = "admin123"

        val etEmail = findViewById<EditText>(R.id.etEmail)
        val etPassword = findViewById<EditText>(R.id.etPassword)
        val btnLogin = findViewById<Button>(R.id.btnLogin)

        btnLogin.setOnClickListener{
            val email: String = etEmail.text.trim().toString()
            val password: String = etPassword.text.trim().toString()
            if(email == emailSucces && password == passwordSucces){
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)

            }
            val rootView: View = findViewById(android.R.id.content)
            Snackbar.make(rootView, "Credenciales incorrectas", Snackbar.LENGTH_LONG).show()
        }

    }
}