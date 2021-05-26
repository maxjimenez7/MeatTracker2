package com.example.meattracker

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.results_consumption.*

class ResultsConsumption: AppCompatActivity()  {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.results_consumption)


        // getIntExtra(InputConsumption.EXTRA_....., 1)
        val porkWeight = intent.getStringExtra(InputConsumption.EXTRA_PORK_WEIGHT)
        //textView_results_beef.setText(porkWeight)
        val finalPorkWater = intent.getStringExtra(InputConsumption.EXTRA_FINAL_PORK_WATER)


        val finalBeefWater = intent.getStringExtra(InputConsumption.EXTRA_FINAL_BEEF_WATER)
        val finalPoultryWater = intent.getStringExtra(InputConsumption.EXTRA_FINAL_POULTRY_WATER)

        val finalPorkFuel = intent.getStringExtra(InputConsumption.EXTRA_FINAL_PORK_FUEL)
        val finalBeefFuel = intent.getStringExtra(InputConsumption.EXTRA_FINAL_BEEF_FUEL)
        val finalPoultryFuel = intent.getStringExtra(InputConsumption.EXTRA_FINAL_POULTRY_FUEL)



        textView_results_pork.text = finalPorkFuel

        //textView_results_pork.text = "By eating " + porkWeight + " pounds of pork, you " +
                //"have consumed about " +  finalPorkWater + " gallons of water.\nYou have also " +
                //"used about " + finalPorkFuel + " BTUs of fuel."
    }



}


