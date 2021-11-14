package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.helloworld)

        // Explicit intent
//        button.setOnClickListener {
//            val intent = Intent(this, SecondActivity::class.java)
//            startActivity(intent)
//        }

        // Implicit intent
//        button.setOnClickListener{
//            val sendIntent = Intent("com.example.SecondActivity");
//            startActivity(sendIntent)
//        }
    }


}