package com.androidsachi.loginapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class Login1Activity : AppCompatActivity() {
    lateinit var mLoginBtn: Button
    lateinit var mCreateUser: TextView
    lateinit var mLoginEmail: EditText
    lateinit var mLoginPass: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login1)

        mLoginBtn = findViewById(R.id.button2)
        mCreateUser = findViewById(R.id.textView2)
        mLoginEmail = findViewById(R.id.editText)
        mLoginPass =  findViewById(R.id.editText2)

        mCreateUser.setOnClickListener {
            val intent = Intent(applicationContext , Login2Activity::class.java)
            startActivity(intent)
            finish()
        }
    }
}
