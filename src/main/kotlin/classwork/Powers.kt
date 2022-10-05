package classwork

import java.util.*

// 22. Powers of a number
fun main(){

    val portgasDAce = Scanner(System.`in`)

    print("Enter any number: ")
    val marco = portgasDAce.nextInt()
    println("You entered $marco")

    print("Enter the power number: ")
    val phoenix = portgasDAce.nextInt()
    println("You entered $phoenix")

    val powers = Math.pow(marco.toDouble(), phoenix.toDouble())
    println("$marco to the power of $phoenix is $powers")
}