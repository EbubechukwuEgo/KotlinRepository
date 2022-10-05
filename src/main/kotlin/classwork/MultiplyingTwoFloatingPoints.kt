package classwork

import java.util.Scanner

// 3. The product of two floating-point numbers
fun main(){

    val scan = Scanner(System.`in`)

    print("Insert the first floating-point number: ")
    val decimal1 = scan.nextFloat()
    println("You inserted $decimal1")

    print("Insert the second floating-point number: ")
    val decimal2 = scan.nextFloat()
    println("You inserted $decimal2")

    val product = decimal1 * decimal2
    println("The product of $decimal1 and $decimal2 is $product")

}