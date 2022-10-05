package classwork

import java.util.Scanner

// 7. Checks whether a number is even or odd
fun main(){

    val usopp = Scanner(System.`in`)

    print("Enter number here: ")
    val sanji = usopp.nextInt()

    if (sanji % 2 == 0){
        println("$sanji is even.")
    } else {
        println("$sanji is odd")
    }
}