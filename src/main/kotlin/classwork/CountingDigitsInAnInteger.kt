package classwork

import java.util.Scanner

// 20. Counting the Number of Digits in an Integer
fun main(){

    val blackbeard = Scanner(System.`in`)

    print("Insert number here: ")
    var marshallDTeach = blackbeard.nextInt()
    var count = 0

    while (marshallDTeach != 0){
        marshallDTeach /= 10
        ++count
    }

    println("Number of digits: $count")
}