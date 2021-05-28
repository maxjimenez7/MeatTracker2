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
        val beefWeight = intent.getStringExtra(InputConsumption.EXTRA_BEEF_WEIGHT)
        val poultryWeight = intent.getStringExtra(InputConsumption.EXTRA_POULTRY_WEIGHT)
        //textView_results_beef.setText(porkWeight)

        val finalPorkWater = intent.getStringExtra(InputConsumption.EXTRA_FINAL_PORK_WATER)
        val finalBeefWater = intent.getStringExtra(InputConsumption.EXTRA_FINAL_BEEF_WATER)
        val finalPoultryWater = intent.getStringExtra(InputConsumption.EXTRA_FINAL_POULTRY_WATER)

        val finalPorkFuel = intent.getStringExtra(InputConsumption.EXTRA_FINAL_PORK_FUEL)
        val finalBeefFuel = intent.getStringExtra(InputConsumption.EXTRA_FINAL_BEEF_FUEL)
        val finalPoultryFuel = intent.getStringExtra(InputConsumption.EXTRA_FINAL_POULTRY_FUEL)

        val totalWater = intent.getStringExtra(InputConsumption.EXTRA_TOTAL_WATER)
        val totalFuel = intent.getStringExtra(InputConsumption.EXTRA_TOTAL_FUEL)

        // pork use textView
        textView_results_pork.text = "By eating " + porkWeight + " pounds of pork, you " +
                "have consumed about " +  finalPorkWater + " gallons of water.\nYou have also " +
                "used about " + finalPorkFuel + " BTUs of fuel."
        // beef use textView
        textView_results_beef.text = "By eating " + beefWeight + " pounds of beef, you " +
                "have consumed about " + finalBeefWater + " gallons of water.\nYou have also " +
                "used about " + finalBeefFuel + " BTUs of fuel."
        // poultry use textView
        textView_results_poultry.text = "By eating " + poultryWeight + " pounds of poultry, you " +
                "have consumed about " + finalPoultryWater + " gallons of water.\nYou have also " +
                "used about " + finalPoultryFuel + " BTUs of fuel."

        textView_results_total.text = "In total, by eating " + porkWeight + " pounds of pork, " +
                beefWeight + " pounds of beef, and " + poultryWeight + " pounds of poultry, " +
                " you have consumed roughly " + totalWater + "gallons of water and " + totalFuel +
                " BTUs of fuel."
    }



}


