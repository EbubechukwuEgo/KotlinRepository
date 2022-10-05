package classwork

import java.util.Scanner

fun main(){

    val dragon = Scanner(System.`in`)

    print("Enter character here: ")
    val sabo = dragon.next().single()

    val ascii = sabo.code
    println("The ascii value for the character $sabo is $ascii")
}