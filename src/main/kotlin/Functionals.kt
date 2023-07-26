import kotlin.math.sqrt

//methods
fun main(){
    //function call
    findTime()

    solveQuadratic()
}

fun findTime(){
    /*
    speed - 1000 m/s
    Acceleration - 25 m/s
    distance - 5 km
    time = ?

    speed = distance / time
    time = distance / speed
     */
    val speed = 1000
    val distance = 5 * 1000
    val time = distance/speed

    println("The time it will take is  $time seconds" )

}

fun solveQuadratic(){
    /*
    x3 + 7x2 + 10x = 0
    x(x2+7x+10) = 0
   root1= 0 or x2 + 7x + 10


    root2 = -b+ sqrt(b2- 4ac)/2a
    root3 = -b-sqrt(b2- 4ac)/2a
     */

    val root1 = 0
    val d = (7*7)-(4*1*10)
    val root2= (-7 - sqrt((d).toDouble()))/2*1
    val root3= (-7 + sqrt((d).toDouble()))/2*1

    println("The roots for x1 is $root1, x2 is $root2, x3 is $root3")
}