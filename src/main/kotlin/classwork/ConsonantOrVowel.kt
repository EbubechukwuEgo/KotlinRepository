package classwork

import java.util.Scanner

// 9. Checking whether a letter is a consonant or vowel
fun main(){

    val jimbei = Scanner(System.`in`)

    print("Insert letter here: ")
    val vivi = jimbei.next().single()
    when (vivi){
        'A','a','E','e','I','i','O','o','U','u' -> println("$vivi is a vowel")
        'B','b','C','c','D','d','F','f','G','g','H','h','J','j',
        'K','k','L','l','M','m','N','n','P','p','Q','q','R','r',
        'S','s','T','t','V','v','W','w','X','x','Y','y','Z','z' -> println("$vivi is a consonant")
        else -> println("Not applicable")
    }
}