import java.util.Scanner

fun main(args: Array<String>){

    println("Program arguments: ${args.joinToString()}")

/*
val number = -5
val result = if (number > 0) "Positive number" else "Negative number"
println(result)
val a = -9
val b = -11
val max = if (a > b){
println("$a is larger than $b.")
println("max variable holds value of a.")
a
} else {
println("$b is larger than $b")
println("max variable holds the variable of b")
b
}
println("max = $max")
nested if statements
*/
    val input = Scanner(System.`in`)
//    print("Enter n1: ")
//    var n1 : Int = input.nextInt()
//    println("You entered $n1")
//    print("Enter n2: ")
//    val n2 : Int = input.nextInt()
//    println("You entered $n2")
//    print("Enter n3: ")
//    val n3 : Int = input.nextInt()
//    println("You entered $n3")
//    val max = if (n1 > n2){
//        if (n1 > n3)
//            n1
//        else
//            n3
//    } else {
//        if (n2 > n3)
//            n2
//        else
//            n3
//    }
//    println("max = $max")

//    var ch = input.next().single()
//    when (ch){
//        'A', 'a', 'E', 'e', 'I', 'i', 'O', 'o', 'U', 'u' -> println("$ch is a vowel")
//        else -> println("$ch is a consonant")
//    }

//    val n = input.nextInt()
//    when (n){
//        1, 2, 3 -> println("n is a positive integer less than 4.")
//        0 -> println("n is zero.")
//        -1, -2 -> println("n is a negative integer greater than -3")
//    }
//
//    val a = input.nextInt()
//    when (a){
//        in 1..10 -> println("a is a positive number less than 11")
//        in 10..100 -> println("a is a positive number between 10 and 100")
//    }

//    val time = input.nextInt()
//    when (time){
//        in 1..12 -> println("Good morning. It is $time o'clock.")
//        in 13..17 -> println("Good afternoon. It is ${time - 12} o'clock")
//        in 18..20 -> println("Good evening. It is ${time - 12} o'clock")
//        in 21..23-> println("Night time is at ${time - 12} o'clock. Go to bed!")
//        24 -> println("Are you a night person? It's midnight.")
//        else -> println("Not applicable, unless you're in North Korea.")
//    }

//    var num = 10
//
//    while (num >= 5){
//        println("Loop: $num")
//        num--
//    }

    // while loops
//    var naturalNumber = 1
//    var sum = 0
//
//    while (naturalNumber <= 100){
//        println("Natural number: $naturalNumber")
//        sum += naturalNumber
//        naturalNumber++
//    }
//
//    println("Sum: $sum")

    // break statements
//    var sum = 0
//    var number : Int
//    while (true){
//        print("Enter a number: ")
//        number = readLine()!!.toInt()
//        if (number == 0)
//            break
//        sum += number
//    }
//    println("Sum: $sum")

    // label breaks
//    first@ for (i in 1..4){
//        second@ for (j in 1..2){
//            println("i = $i, j = $j")
//            if (i == 4)
//                break@first
//        }
//    }

//    var num1 = 4
//    outer@ while (num1 > 0){
//        var num2 = 4
//        inner@ while (num2 > 0){
//            if (num1 == 2)
//                break@outer
//            println("num1 = $num1, num2 = $num2")
//            num2--
//        }
//        num1--
//    }
}