package com.example.meattracker



object Calculate {

    var pork : Double = 0.0
    // per pound of pork
    // var can change
    var beef : Double = 0.0
    // per pound of beef
    var poultry : Double = 0.0
    // per pound of poultry


    var water: Double = 0.0
    // in gallons, var can change
    val fossilFuels: Int = 0
   // in BTU


    fun calculatePorkWater(var pork : Int ): Int {
        val waterUsePork : Int = 576
        // var for approximate pork water use
        var porkWater = pork * waterUsePork
        return porkWater
    }
    fun calculateBeefWater( beef : Int): Int {
        val waterUseBeef : Int = 2437
        var beefWater = beef * waterUseBeef
        return beefWater
    }
    fun calculatePoultryWater(poultry : Int): Int {
        val waterUsePoultry : Int = 520
        // var for approximate poultry water use
        var poultryWater = poultry * waterUsePoultry
        return poultryWater
    }

    fun totalWaterConsumption(porkWater : Int, beefWater : Int, poultryWater : Int) : Int{
        val totalWater : Int = porkWater + beefWater + poultryWater
        return totalWater
    }




    fun calculatePorkFuel(pork: Double): Double{
        var porkFuel = pork * 6.3
    }
    fun calculateBeefFuel(beef: Double): Double{}
    fun calculatePoultryFuel(poultry: Double): Double{}

    // one function that adds them
    // return an array and access the first string first item in array

}