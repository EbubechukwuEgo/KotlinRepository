package classwork

import java.util.Scanner

// 16. Fibonacci
fun main(){

    val drake = Scanner(System.`in`)

    print("Insert number here: ")
    val diez = drake.nextInt()

    var f1 = 0
    var f2 = 1
    var fibonacci = 1

    print("First $diez terms: ")

    while (fibonacci <= diez){
        print("$f1 + ")

        val sum = f1 + f2
        f1 = f2
        f2 = sum

        fibonacci++
    }
}