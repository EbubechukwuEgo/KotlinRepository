package classwork

import java.util.Scanner

// 17. Highest Common Factor of Two Numbers
fun main(){

    val reiju = Scanner(System.`in`)

    print("Insert first number here: ")
    val praline = reiju.nextInt()
    print("Insert second number here: ")
    val pudding = reiju.nextInt()

    var hcf = 1

    var i = 1

    while (i <=praline && i <= pudding){
        if (praline % i == 0 && pudding % i == 0)
            hcf = i
        i++
    }

    println("The hcf of $praline and $pudding is $hcf")
}