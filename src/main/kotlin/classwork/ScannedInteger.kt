package classwork

import java.util.Scanner

// 1. Printing an integer entered by the user.
fun main(){
    var input = Scanner(System.`in`)

    print("Insert integer here: ")
    var number = input.nextInt()
    println("You entered $number")
}