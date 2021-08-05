import java.util.*

fun main(args: Array<String>) {
    var scanner= Scanner(System.`in`)
    println("Enter email")
    var email= scanner.next()

    println("Enter password")
    var password= scanner.next()

    login(email,password)
}
fun login(email:String, password:String){
    if (email== "emobilis@gmail.com" && password== "emobilis123"){
        var scanner=Scanner(System.`in`)
        println("Enter weight")
        var weight=scanner.nextDouble()

        println("Enter height")
        var height=scanner.nextDouble()

        var BMI= weight/Math.pow(height,2.0)
        if (BMI<18.5){
            println("Underweight")
        }else if (BMI<24.5){
            println("Normal weight")
        }else if (BMI<29.5){
            println("Overweight")
        }else{
            println("Obese")
        }
    }else println("Sorry, wrong email or password")

}