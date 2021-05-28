package com.example.meattracker

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.input_consumption.*
import kotlinx.android.synthetic.main.results_consumption.*

class InputConsumption : AppCompatActivity() {

    private val TAG = "InputConsumption"

    companion object{
        val EXTRA_PORK_WEIGHT = "hello"
        val EXTRA_BEEF_WEIGHT = "text"
        val EXTRA_POULTRY_WEIGHT = "test"

        val EXTRA_FINAL_PORK_WATER = "hi"
        val EXTRA_FINAL_BEEF_WATER = "hey"
        val EXTRA_FINAL_POULTRY_WATER = "bonjour"

        val EXTRA_FINAL_PORK_FUEL = "hola"
        val EXTRA_FINAL_BEEF_FUEL = "red"
        val EXTRA_FINAL_POULTRY_FUEL = "orange"

        val EXTRA_TOTAL_WATER = "yellow"
        val EXTRA_TOTAL_FUEL = "green"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.input_consumption)

        button_input_consumption_results.setOnClickListener{
            // (editTextNumber_input_consumption_pork)
            val porkWeight: Int = editTextNumber_input_consumption_pork.text.toString().toInt()
            val beefWeight: Int = editTextNumber_input_consumption_beef.text.toString().toInt()
            val poultryWeight: Int = editTextNumber_input_consumption_poultry.text.toString().toInt()

            val finalPorkWater = Calculate.calculatePorkWater(porkWeight)
            val finalBeefWater = Calculate.calculateBeefWater(beefWeight)
            val finalPoultryWater= Calculate.calculatePoultryWater(poultryWeight)

            val finalPorkFuel = Calculate.calculatePorkFuel(porkWeight.toDouble())
            val finalBeefFuel = Calculate.calculateBeefFuel(beefWeight.toDouble())
            val finalPoultryFuel = Calculate.calculatePoultryFuel(poultryWeight.toDouble())

            val totalWater = Calculate.totalWaterConsumption(porkWeight, beefWeight, poultryWeight)
            val totalFuel = Calculate.totalFuelConsumption(porkWeight.toDouble(), beefWeight.toDouble(), poultryWeight.toDouble())

            Log.d(TAG, "onStart has been called")

            val resultsIntent = Intent(this, ResultsConsumption::class.java).apply {
                putExtra(EXTRA_PORK_WEIGHT, porkWeight.toString())
                putExtra(EXTRA_BEEF_WEIGHT, beefWeight.toString())
                putExtra(EXTRA_POULTRY_WEIGHT, poultryWeight.toString())

                putExtra(EXTRA_FINAL_PORK_WATER, finalPorkWater.toString())
                putExtra(EXTRA_FINAL_BEEF_WATER, finalBeefWater.toString())
                putExtra(EXTRA_FINAL_POULTRY_WATER, finalPoultryWater.toString())

                putExtra(EXTRA_FINAL_PORK_FUEL, finalPorkFuel.toString())
                putExtra(EXTRA_FINAL_BEEF_FUEL, finalBeefFuel.toString())
                putExtra(EXTRA_FINAL_POULTRY_FUEL, finalPoultryFuel.toString())

                putExtra(EXTRA_TOTAL_WATER, totalWater.toString())
                putExtra(EXTRA_TOTAL_FUEL, totalFuel.toString())
            }
            startActivity(resultsIntent)

            //val intent = Intent(this, ResultsConsumption::class.java).apply{
                //Toast.makeText(this@InputConsumption, "Your results are ready", Toast.LENGTH_LONG).show()

            //}
            //startActivity(intent)



        }


    }




}