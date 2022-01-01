package com.example.c_05

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Notify : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_notify)
    }

     fun clc(view: android.view.View) {
        val i = Intent(this, MainActivity::class.java)
        startActivity(i)
        finish()
        }
}

