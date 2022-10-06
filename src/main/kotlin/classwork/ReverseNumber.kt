package classwork

import java.util.Scanner

// 21. Reverse a number
fun main(){

    val cavendish = Scanner(System.`in`)

    print("Insert number here: ")
    var bartolomeo = cavendish.nextInt()
    println("You inserted $bartolomeo")

    var reversed = 0

    while (bartolomeo != 0){
        val digit = bartolomeo % 10
        reversed = reversed * 10 + digit
        bartolomeo /= 10
    }

    println("Reversed: $reversed")
}