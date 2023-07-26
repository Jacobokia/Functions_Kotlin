fun main(){
//    println("Enter first number:")
//    val firstNumber = readln().toInt()
//
//    println("Enter second number:")
//    val secondNumber = readln().toInt()
//
//    addTwoNumbers(firstNumber,secondNumber)

    println("Enter first number:")
    val number = readln().toFloat()

    println("Enter second number:")
    val number2 = readln().toFloat()
    println("Enter second number:")
    val number3= readln().toFloat()

    multiplyThreeFloats(number,number2, number3)
}

fun addTwoNumbers(a:Int, b:Int):Int{
    val x = a + b
    println("The sum of $a and $b is : $x")
    return x
}

fun multiplyThreeFloats(a:Float, b:Float, c:Float):Float{
    val x = a * b * c
    println("The multiplication of $a and $b  and $c is : $x")
    return x
}