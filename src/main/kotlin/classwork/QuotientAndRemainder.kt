package classwork

import java.util.Scanner

// 5. Quotient and Remainder of Two Numbers
fun main(){

    val luffy = Scanner(System.`in`)

    print("Enter first number: ")
    val zoro = luffy.nextInt()
    println("You entered $zoro")

    print("Enter second number: ")
    val nami = luffy.nextInt()
    println("You entered $nami")

    val quotient1 = zoro / nami
    val quotient2 = nami / zoro

    val remainder1 = zoro % nami
    val remainder2 = nami % zoro

    println("The quotient of $zoro divided by $nami is $quotient1 and the remainder is $remainder1")
    println("The quotient of $nami divided by $zoro is $quotient2 and the remainder is $remainder2")
}