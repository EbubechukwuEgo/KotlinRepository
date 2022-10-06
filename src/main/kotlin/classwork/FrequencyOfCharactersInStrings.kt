package classwork

import java.util.Scanner

// 8. The frequency of a character in a string
fun main(){

    val eustassKidd = Scanner(System.`in`)

    print("Insert String here: ")
    val basilHawkins = eustassKidd.nextLine()

    print("Insert character here: ")
    val killer = eustassKidd.next().single()

    var frequency = 0

    for (i in 0..basilHawkins.length - 1){
        if (killer == basilHawkins[i]){
            ++frequency
        }
    }

    println("The frequency of $killer in $basilHawkins = $frequency")
}