fun main(){

 //val add ={a:Int -> print("The value is $a")}
  //add(6)
    val addThreeNumbers = { a:Int, b:Int, c:Int -> a + b + c}
    val answer = addThreeNumbers(4,5,6)
    println(answer)
}

fun addNumbers(a:Int, b:Int):Int {
    val x = a + b
    //println("The sum of $a and $b is : $x")
    return x
}



fun multiply(x:Int){
    val y = x * 50
}