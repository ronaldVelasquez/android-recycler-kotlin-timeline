package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        val loginButton = findViewById<Button>(R.id.btn_login)
        val emailEdittext = findViewById<EditText>(R.id.edtxt_email)
        val passwordEdittext = findViewById<EditText>(R.id.edtxt_password)

        loginButton.setOnClickListener {
            evaluateCredentials(emailEdittext.text.toString(), passwordEdittext.text.toString())
        }
    }

    private fun evaluateCredentials(email: String, password: String) {
        Toast.makeText(this, "Press login button", Toast.LENGTH_LONG).show()
    }

    private fun showTimeline() {
        val intent = Intent(this, TimelineActivity::class.java)
        startActivity(intent)
    }
}