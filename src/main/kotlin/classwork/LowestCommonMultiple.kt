package classwork

import java.util.Scanner

// 18. Lowest Common Multiple of Two Numbers
fun main(){

    val jesus = Scanner(System.`in`)

    print("Insert first number here: ")
    val chuy = jesus.nextInt()
    print("Insert second number here: ")
    val burgess = jesus.nextInt()

    var hcf = 1

    var i = 1

    while (i <= chuy && i <= burgess){
        if (chuy % i == 0 && burgess % i == 0)
            hcf = i
        i++
    }

    val lcm = chuy * burgess / hcf
    print("The lowest common multiple of $chuy and $burgess is $lcm")
}