package classwork

import java.util.Scanner

// 14. Factorial of a number
fun main(){

    val linlin = Scanner(System.`in`)

    print("Insert number here: ")
    val katakuri = linlin.nextLong()

    var factorial = 1

    var counter = 1

    while (counter <= katakuri){
        factorial *= counter
        counter++
    }

    println("Factorial of $katakuri is $factorial")
}