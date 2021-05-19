package com.example.meattracker

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.input_consumption.*
import kotlinx.android.synthetic.main.results_consumption.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)




        button_main_calculate.setOnClickListener {
            //button_main_calculate.visibility = View.GONE
            //textView_main_title.visibility = View.GONE
            // intent instead to input consump xml
            // add listener to edit text fields called textwatcher
            val intent = Intent(this, R.layout.input_consumption::class.java).apply {
                Toast.makeText(this@MainActivity, "Input consumption now", Toast.LENGTH_LONG)

            }
            startActivity(intent)
        }

        button_input_consumption_results.setOnClickListener{
            //textView_results.add
            // (editTextNumber_input_consumption_pork)
            var pork : Int = editTextNumber_input_consumption_pork.text.toString().toInt()
            var beef : Int = editTextNumber_input_consumption_beef.text.toString().toInt()
            var poultry : Int = editTextNumber_input_consumption_poultry.text.toString().toInt()
        }
    }

    // android.text.TextWatcher

    fun inputConsumption(){
        var beef : Int = editTextNumber_input_consumption_beef.text.toString().toInt()
        //beef = String.
        val beefConsumption = beef * 2437.5
    }


}





