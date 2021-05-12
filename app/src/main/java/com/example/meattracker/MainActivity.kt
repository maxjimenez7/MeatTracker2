package com.example.meattracker

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.input_consumption.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)




        button_main_calculate.setOnClickListener {
            //button_main_calculate.visibility = View.GONE
            //textView_main_title.visibility = View.GONE
            setContentView(R.layout.input_consumption)
            Toast.makeText(this@MainActivity, "Input consumption now", Toast.LENGTH_LONG)
        }

    }

    fun inputConsumption(){
        //editTextNumber_main_input_beef_consumption.setOnEdit
        }
        
}


