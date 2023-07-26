fun main(){
    println("Enter first number:")
    val firstNumber = readln().toDouble()

    println("Enter second number:")
    val secondNumber = readln().toDouble()

    println("Enter character:")
    val character= readln()

    val result =calculateNumbersWithCharacter(firstNumber,secondNumber, character )

    println(result)



}

fun calculateNumbersWithCharacter(firstNumber: Double, secondNumber:Double, character:String):Double{

    if(character== "*") {
        return firstNumber * secondNumber
    } else if (character =="-") {
        return firstNumber - secondNumber
    } else if (character =="/") {
        return firstNumber / secondNumber
    }else if (character =="+") {
        return firstNumber + secondNumber
    }else{
       return 0.0
    }

}