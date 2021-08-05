import java.util.*
import kotlin.math.pow

fun main(args: Array<String>) {

    var cylindervolume = Scanner(System.`in`)

    println("Enter your radius")
    var radius= cylindervolume.nextDouble()

    println("Enter your height")
    var height2= cylindervolume.nextDouble()

    var volume= 3.142 * height2 * radius.pow(2.0)
    println("Your volume is $volume")
}




