package com.example.meattracker

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.input_consumption.*
import kotlinx.android.synthetic.main.results_consumption.*

class InputConsumption : AppCompatActivity() {
    companion object{
        val EXTRA_PORK_WEIGHT = "1"
        val EXTRA_BEEF_WEIGHT = "2"
        val EXTRA_POULTRY_WEIGHT = "3"

        val EXTRA_FINAL_PORK_WATER = "4"
        val EXTRA_FINAL_BEEF_WATER = "5"
        val EXTRA_FINAL_POULTRY_WATER = "6"

        val EXTRA_FINAL_PORK_FUEL = "7"
        val EXTRA_FINAL_BEEF_FUEL = "8"
        val EXTRA_FINAL_POULTRY_FUEL = "9"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.input_consumption)





        button_input_consumption_results.setOnClickListener{
            //textView_results.add
            // (editTextNumber_input_consumption_pork)
            val intent = Intent(this, ResultsConsumption::class.java).apply{
                Toast.makeText(this@InputConsumption, "Your results are ready", Toast.LENGTH_LONG).show()

            }
            startActivity(intent)

            //if(editTextNumber) {
            var porkWeight: Int = editTextNumber_input_consumption_pork.text.toString().toInt()
            var beefWeight: Int = editTextNumber_input_consumption_beef.text.toString().toInt()
            var poultryWeight: Int =
                editTextNumber_input_consumption_poultry.text.toString().toInt()


            //}

            val finalPorkWater = Calculate.calculatePorkWater(porkWeight)
            val finalBeefWater = Calculate.calculateBeefWater(beefWeight)
            val finalPoultryWater= Calculate.calculatePoultryWater(poultryWeight)

            val finalPorkFuel = Calculate.calculatePorkFuel(porkWeight.toDouble())
            val finalBeefFuel = Calculate.calculateBeefFuel(beefWeight.toDouble())
            val finalPoultryFuel = Calculate.calculatePoultryFuel(poultryWeight.toDouble())


            val totalWater = Calculate.totalWaterConsumption(porkWeight, beefWeight, poultryWeight)
            val totalFuel = Calculate.totalFuelConsumption(porkWeight.toDouble(), beefWeight.toDouble(), poultryWeight.toDouble())

            val resultsIntent = Intent(this, ResultsConsumption::class.java).apply {
                putExtra(EXTRA_PORK_WEIGHT, porkWeight)
                putExtra(EXTRA_BEEF_WEIGHT, beefWeight)
                putExtra(EXTRA_POULTRY_WEIGHT, poultryWeight)

                putExtra(EXTRA_FINAL_PORK_WATER, finalPorkFuel)
            }
            startActivity(resultsIntent)

            //textView.text = game.score.toString()
            // setting textview to result .tostring

        }
    }


}