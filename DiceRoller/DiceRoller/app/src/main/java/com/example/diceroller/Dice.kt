package com.example.diceroller

class Dice(val numsides: Int) {
    var sides = numsides

    fun roll(): Int {
        return (1..numsides).random()
    }
}
