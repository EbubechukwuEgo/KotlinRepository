package classwork

import java.util.Scanner

// 2. The sum of two integers
fun main(){

    val input = Scanner(System.`in`)

    print("Insert the first number: ")
    val num1 = input.nextInt()
    println("You inserted $num1")

    print("Insert the second number: ")
    val num2 = input.nextInt()
    println("You inserted $num2")

    val sum = num1 + num2
    println("The sum of $num1 and $num2 is $sum")
}