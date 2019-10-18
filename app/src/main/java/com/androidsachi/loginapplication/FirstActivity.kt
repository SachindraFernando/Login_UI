package com.androidsachi.loginapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class FirstActivity : AppCompatActivity() {

    lateinit var mLoginBtn0: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first)

        mLoginBtn0 = findViewById(R.id.button5)

        mLoginBtn0.setOnClickListener {
            val intent = Intent(applicationContext, Login1Activity::class.java)
            startActivity(intent)
            finish()

        }
    }
}
