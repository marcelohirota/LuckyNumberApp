package com.mh.luckynumberapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class LuckyNumberActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lucky_number)

        val text1: TextView = findViewById(R.id.text1)

        val luckyText: TextView = findViewById(R.id.luckyNumTxt)

        val shareBtn : Button = findViewById(R.id.shareBtn)

    }
}