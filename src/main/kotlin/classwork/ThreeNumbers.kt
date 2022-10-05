package classwork

import java.util.Scanner

// Largest of three numbers
fun main(){

    val chopper = Scanner(System.`in`)

    print("Enter first number: ")
    val robin = chopper.nextInt()
    println("You entered $robin")

    print("Enter second number: ")
    val franky = chopper.nextInt()
    println("You entered $franky")

    print("Enter third number: ")
    val brook = chopper.nextInt()
    println("You entered $brook")

    val max = if (robin > franky){
        if (robin > brook)
            robin
        else
            brook
    } else {
        if (franky > brook)
            franky
        else
            brook
    }

    println("The largest of three numbers is $max")

}