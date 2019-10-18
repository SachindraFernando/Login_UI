package com.androidsachi.loginapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText


class Login2Activity : AppCompatActivity() {

    lateinit var mLoginBtn1: Button
    lateinit var mLoginEmail1: EditText
    lateinit var mLoginPass1: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login2)

        mLoginBtn1 = findViewById(R.id.button3)
        mLoginEmail1 = findViewById(R.id.editText4)
        mLoginPass1 =  findViewById(R.id.editText5)
    }
}
