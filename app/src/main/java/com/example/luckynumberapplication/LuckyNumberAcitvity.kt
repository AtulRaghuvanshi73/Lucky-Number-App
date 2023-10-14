package com.example.luckynumberapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import kotlin.random.Random

class LuckyNumberAcitvity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lucky_number_acitvity)

        //intialising all the views and buttons
        val text1 : TextView = findViewById(R.id.text1)
        val luckyNum : TextView = findViewById(R.id.luckyNumTxt)
        val sharebtn: Button = findViewById(R.id.button)

        var user_name = receiveUserName()
//        Toast.makeText(this,"Name: "+user_name, Toast.LENGTH_LONG).show()

        var random_num = randomNumGenerator()
//        Toast.makeText(this,""+random_num, Toast.LENGTH_LONG).show()
        luckyNum.setText(""+random_num) //a string must be added as the activity will not redirect to an integer

    }

    fun receiveUserName():String{
        var bundle : Bundle? = intent.extras
        var user_name = bundle?.get("value").toString()
        return user_name
    }

    fun randomNumGenerator():Int{
//        val randomInteger = (1..12).shuffled().first()
//        assertEquals { randomInteger >= 1 }
//        assertEquals { randomInteger <= 12 }
        val random = Random.nextInt(1000)
        return random
    }
}