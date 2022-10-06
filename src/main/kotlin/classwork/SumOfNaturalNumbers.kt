package classwork

import java.util.Scanner

// 13. Sum of Natural Numbers
fun main(){

    val kaido = Scanner(System.`in`)

    print("How many natural numbers do you want? ")
    val king = kaido.nextInt()
    var naturalNumber = 1

    var sum = 0

    while (naturalNumber <= king){
        println("Natural number: $naturalNumber")
        sum += naturalNumber
        naturalNumber++
    }

    println("Sum of all natural numbers is $sum")
}