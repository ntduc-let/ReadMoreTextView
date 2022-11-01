package com.ntduc.readmoretextview

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val text1 = findViewById<TextView>(R.id.text1)
        text1.text = getString(R.string.lorem_ipsum)
        val text2 = findViewById<TextView>(R.id.text2)
        text2.text = getString(R.string.lorem_ipsum2)
        val text3 = findViewById<TextView>(R.id.text3)
        text3.text = getString(R.string.lorem_ipsum3)
        val text4 = findViewById<TextView>(R.id.text4)
        text4.text = getString(R.string.one_line_text)
    }
}