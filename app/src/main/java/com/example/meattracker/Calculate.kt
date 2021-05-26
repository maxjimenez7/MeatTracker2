package com.example.meattracker



object Calculate {





    fun calculatePorkWater( pork : Int ): Int {
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

    fun totalWaterConsumption(porkWeight : Int, beefWeight : Int, poultryWeight : Int) : Int{
        // pork weight parameters
        // call func calculatePoultryWater() + ...
        val totalWater : Int = calculatePorkWater(porkWeight) + calculateBeefWater(beefWeight) +
                calculatePoultryWater(poultryWeight)
        return totalWater
    }

    fun totalFuelConsumption(porkWeight: Double, beefWeight: Double, poultryWeight:Double) : Double{
        val totalFuel : Double = calculatePorkFuel(porkWeight) + calculateBeefFuel(beefWeight) +
                calculatePoultryFuel(poultryWeight)
        return totalFuel
    }



    fun calculatePorkFuel(pork: Double): Double{
        var porkFuel = pork * 6.3
        return porkFuel
    }
    fun calculateBeefFuel(beef: Double): Double{
        var beefFuel = beef * 4.7
        return beefFuel
    }
    fun calculatePoultryFuel(poultry: Double): Double{
        var poultryFuel = poultry * 2.5
        return poultryFuel
    }

    // one function that adds them
    // return an array and access the first string first item in array




}