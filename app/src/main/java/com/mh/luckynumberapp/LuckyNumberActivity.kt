package com.mh.luckynumberapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class LuckyNumberActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lucky_number)

        val text1: TextView = findViewById(R.id.text1)
        val luckyText: TextView = findViewById(R.id.luckyNumTxt)
        val shareBtn : Button = findViewById(R.id.shareBtn)
        
        var user_name = receiveUserName()
        var random_num = generateRandomNumber()

        luckyText.text = random_num.toString()

        shareBtn.setOnClickListener {
            shareDate(user_name.toString(), random_num)
        }

    }

    // Getting username from MainActivity
     fun receiveUserName(): String? {
        var bundle: Bundle? = intent.extras
        return bundle?.get("name").toString()
    }

    // Generating random number for the user
    fun generateRandomNumber(): Int {
        return (1..1000).random()
    }

    // Sharing the lucky number and username
    fun shareDate(username: String, luckyNum: Int) {

        var i = Intent(Intent.ACTION_SEND)
        i.type = "text/plain"
        i.putExtra(Intent.EXTRA_SUBJECT, "$username is lucky today")
        i.putExtra(Intent.EXTRA_TEXT, "Your lucky number is $luckyNum")
        startActivity(i)
    }
}