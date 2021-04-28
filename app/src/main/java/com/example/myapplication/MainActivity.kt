package com.example.myapplication

import android.R
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    private var textView: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        textView = findViewById<View>(R.id.tv) as TextView
        textView!!.text = "hello 12345"
        val msg = textView!!.text.toString().trim { it <= ' ' }
        textView!!.setOnClickListener(object : OnClickListener() {
            fun onClick(view: View?) {
                Toast.makeText(applicationContext, msg, Toast.LENGTH_SHORT).show()
            }
        })
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}