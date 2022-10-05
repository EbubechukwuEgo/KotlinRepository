package classwork

import java.util.Scanner

// 11. Determining if a year is a leap year
fun main(){
    val trafalgarLaw = Scanner(System.`in`)

    print("Insert year here: ")
    val year = trafalgarLaw.nextInt()

    if (year % 4 == 0){
        println("$year is a leap year")
    } else if (year % 100 == 0){
        println("$year is a common year")
    } else if (year % 400 == 0){
        println("$year is a leap year")
    } else {
        println("$year is a common year")
    }
}