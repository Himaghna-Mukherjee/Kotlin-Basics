package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //get reference to button
        //val btnClickMe = findViewById(R.id.button) as Button
        //val myTextView = findViewById(R.id.textView) as TextView
        var timesClicked = 0
        //set on=click listener
        button.setOnClickListener {
            timesClicked += 1
            textView.text = timesClicked.toString()
            Toast.makeText(this@MainActivity, "Sup", Toast.LENGTH_SHORT).show()

        }




    }
}