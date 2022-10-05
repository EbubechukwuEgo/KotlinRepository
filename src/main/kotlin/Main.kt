import java.util.Scanner

fun main(args: Array<String>) {
    println("Hello World my name is Ebube!")

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")

    val myName = "Ebube"
//    myName = "Han Solo"
    println("My Name is: $myName")

//    val numeroUno = 45
//    val numeroDos = 28

//    val sum = numeroUno + numeroDos
//    val minus = numeroUno - numeroDos
//    val times = numeroUno * numeroDos
//    val divide = numeroUno / numeroDos
//    val modulus = numeroUno % numeroDos
//
//    println("The result of adding $numeroUno and $numeroDos is $sum")
//    println("The result of subtracting $numeroDos from $numeroUno is $minus")
//    println("The result of multiplying $numeroUno and $numeroDos is $times")
//    println("The result of dividing $numeroUno by $numeroDos is $divide")
//    println("The remainder of dividing $numeroUno by $numeroDos is $modulus")

//    val a = 1
//    val b = true
//    var c = 1
//    var result: Int
//    var booleanResult: Boolean
//    result = -a
//    println("-a = $result")
//    booleanResult = !b
//    println("!b = $booleanResult")
//    --c
//    println("--c = $c")

//    var language = "French"
//    val score = 95
//    val score1: Int = 95
//    var language1: String = "French"

//    val a = -12
//    val b = 12
//    val max = if (a > b){
//        println("a is larger than b")
//        a
//    } else {
//        println("b is larger than a")
//        b
//    }
//    println("max = $max")
//
//    val ab = -32
//    val ba = 32
//    if (ab < ba){
//        println("ab is smaller than ba")
//        println(ab)
//    } else {
//        println("ba is smaller than ab")
//        println(ba)
//    }

//    val a = 10
//    val b = 9
//    val c = -1
//    var result: Boolean
//    result = (a>b) && (a>c) // result = (a>b) and (a>c)
//    println(result)

//    val numbers = intArrayOf(1, 4, 42, -3)
//    if (4 in numbers){
//        println("numbers array contains 4.")
//    }
//
//    val unit = 5
//    val units = intArrayOf(7, 5, 87, 98, 3486)
//    if (unit in units){
//        println("$unit is contained within units array")
//    }

//    val a = intArrayOf(1, 2, 3, 4, -1)
//    println(a[1])
//    a[1] = 12
//    println(a[1])

//    val number1: Int = 33
//    val number2: Byte = number1.toByte()

//    print("Enter text: ")
//    val stringInput = readLine()!!
//    println("You entered: $stringInput")
//
//    val reader = Scanner(System.`in`)
//    print("Enter a number: ")
//    var number: Int = reader.nextInt()
//    println("You entered: $number")
//    print("Enter another number: ")
//    var number1: Int = reader.nextInt()
//    println("You entered: $number1")
//    if (number > number1) {
//        println("$number is greater than $number1")
//    } else if (number < number1) {
//        println("$number1 is greater than $number")
//    } else {
//        println("$number and $number1 have the same value")
//    }

    // nextLong(), nextFloat(), nextDouble(), nextBoolean()

//    print("Enter a long number: ")
//    var longNumber: Long = reader.nextLong()
//    println("You entered: $longNumber")
//
//    print("Enter a floating-point number: ")
//    var float: Float = reader.nextFloat()
//    println("You entered: $float")
//
//    print("Enter a double: ")
//    var double: Double = reader.nextDouble()
//    println("You entered: $double")
//
//    print("Enter a boolean value: ")
//    var trueOrFalse: Boolean = reader.nextBoolean()
//    println("You entered: $trueOrFalse")

    val number = -5
    val result = if (number > 0) "Positive number" else "Negative number"
    println(result)
}