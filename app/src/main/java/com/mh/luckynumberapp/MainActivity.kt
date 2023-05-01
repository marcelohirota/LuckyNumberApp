package com.mh.luckynumberapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn1: Button = findViewById(R.id.button)

        val txt: TextView = findViewById(R.id.textView)

        val editTXT: EditText = findViewById(R.id.editText)

        btn1.setOnClickListener {
            var username = editTXT.text

            var i : Intent = Intent(this, LuckyNumberActivity::class.java)

            i.putExtra("name", username)

            startActivity(i)
        }
    }
}