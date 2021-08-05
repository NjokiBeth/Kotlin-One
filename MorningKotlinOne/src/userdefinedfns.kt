import java.util.*
import kotlin.math.pow

fun main(args: Array<String>) {
    var scanner = Scanner(System.`in`)
    motto()
    avg(45, 564.0, 634.345f)
    println("Enter the principle")
    var principle =scanner.nextDouble()

    println("Enter the rate")
    var rate= scanner.nextDouble()

    println("Enter the time")
    var time = scanner.nextDouble()

    si(principle,rate,time)
}
fun motto(){
    println("Hello, this is our motto")
}
fun avg(x:Int, y:Double, z:Float){
    var average = (x+y+z)/3.0
    println("Your answer is $average")
}
fun si(p:Double, r:Double, t:Double){
    var simple_interest = (p*r*t)/100.0
    if (simple_interest <= 10000){
        println("Go ahead and get the loan, your interest will be $simple_interest")
    }else{
        println("Please consider other options, this loan is too expensive")
    }
}


