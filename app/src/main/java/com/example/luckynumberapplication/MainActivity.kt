package com.example.luckynumberapplication

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

        //intialising all the buttons for Activity 1

        val t1 : TextView = findViewById(R.id.textView)
        val et1 : EditText = findViewById(R.id.editText)
        val btn : Button = findViewById(R.id.btn)

        btn.setOnClickListener(){
            var name = et1.text
            var i : Intent = Intent(this, LuckyNumberAcitvity::class.java)
            i.putExtra("value",name)
            startActivity(i)
        }

    }
}