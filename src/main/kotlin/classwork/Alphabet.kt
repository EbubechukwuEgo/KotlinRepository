package classwork

import java.util.Scanner

// 12. Whether a character is in the alphabet or not
fun main(){

    val charAznable = Scanner(System.`in`)

    print("Insert character here: ")
    val amuroRay = charAznable.next().single()

    when (amuroRay){
        'A','B','C','D','E','F','G','H','I','J','K','L','M',
        'N','O','P','Q','R','S','T','U','V','W','X','Y','Z' -> println("$amuroRay is a capital letter")
        'a','b','c','d','e','f','g','h','i','j','k','l','m',
        'n','o','p','q','r','s','t','u','v','w','x','y','z' -> println("$amuroRay is a lowercase letter")
        else -> println("$amuroRay is not a letter in the Alphabet.")
    }
}