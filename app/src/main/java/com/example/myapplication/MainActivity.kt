package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        val firstFragment = FirstFragment()
//        fm.beginTransaction().add(R.id.mainLayout,firstFragment).commit()


    }

//    override fun displayDetails(title: String, description: String) {
//        if(mIsDualPane){
//            val secondButton = findViewById<ImageButton>(R.id.imageBtn2);
//            secondButton.setOnClickListener(){
//                secondButton.setOnClickListener{
//                    val secondFragment = SecondFragment()
//                    val firstFragment = FirstFragment()
//                    val transaction: FragmentTransaction = fragmentManager!!.beginTransaction()
//                    transaction.replace(R.id.fragmentB,secondFragment)
//                    transaction.commit()
//                }
//            }
//        }
//    }
}