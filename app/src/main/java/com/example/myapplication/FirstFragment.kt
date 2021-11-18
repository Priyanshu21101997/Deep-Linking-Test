package com.example.myapplication

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import android.widget.ImageButton
import androidx.fragment.app.FragmentTransaction

class FirstFragment : Fragment() {

    private var mIsDualPane = false


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        }

    @SuppressLint("UseRequireInsteadOfGet")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val v = inflater.inflate(R.layout.fragment_first, container, false)

//        val fragmentBView = v.findViewById<View>(R.id.fragmentB)
//
//        if(fragmentBView != null){
//            mIsDualPane = true
//        }
//
//        if(mIsDualPane) {

        val imageButton1 = v.findViewById<ImageButton>(R.id.imageBtn1)

        imageButton1.setOnClickListener {
            val secondFragment = SecondFragment()
            val transaction: FragmentTransaction = fragmentManager!!.beginTransaction()
            transaction.replace(R.id.fragmentB, secondFragment)
            transaction.commit()
        }


            val imageButton2 = v.findViewById<ImageButton>(R.id.imageBtn2)

            imageButton2.setOnClickListener {
                val buttonTwoFragment = ButtonTwoFragment()
                val transaction: FragmentTransaction = fragmentManager!!.beginTransaction()
                transaction.replace(R.id.fragmentB, buttonTwoFragment)
                transaction.commit()
            }
//        }
//        else {
//
//            val imageButton = v.findViewById<ImageButton>(R.id.imageBtn1)
//
//            imageButton.setOnClickListener {
//                val secondFragment = SecondFragment()
//                val transaction: FragmentTransaction = fragmentManager!!.beginTransaction()
//                transaction.replace(R.id.mainLayout, secondFragment)
//                transaction.commit()
//            }
//
//            val imageButton2 = v.findViewById<ImageButton>(R.id.imageBtn2)
//
//            imageButton2.setOnClickListener {
//                val buttonTwoFragment = ButtonTwoFragment()
//                val transaction: FragmentTransaction = fragmentManager!!.beginTransaction()
//                transaction.replace(R.id.mainLayout, buttonTwoFragment)
//                transaction.commit()
//            }
//        }

        return v
    }

}