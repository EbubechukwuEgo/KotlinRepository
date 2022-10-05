package classwork

import java.util.Scanner

// 15. Multiplication Table

fun main(){

    val doflamingo = Scanner(System.`in`)

    print("Enter number here: ")
    val corazon = doflamingo.nextInt()
    println("You just entered $corazon")

    var multiplier = 0

    while (multiplier <= 12){
        val sugar = corazon * multiplier
        println("$corazon X $multiplier = $sugar")
        multiplier++
    }
}