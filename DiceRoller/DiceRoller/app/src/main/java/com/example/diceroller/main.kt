package com.example.diceroller

fun main(){
    val myFirstDice = Dice(6)
    val diceRoll = myFirstDice.roll()

    println("Tu dado de ${myFirstDice.sides} dados, rodo ${diceRoll}!")
}

