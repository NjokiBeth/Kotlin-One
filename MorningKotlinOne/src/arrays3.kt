import java.util.*

fun main(args: Array<String>) {
    var chukua = Scanner(System.`in`)
    println("How many employees do you have")
    var number = chukua.nextInt()
    var employees = arrayOfNulls<String>(number)
    var salaries = arrayOfNulls<Double>(number)
    println("Enter the $number employees")
    //write loop to receive the names and salaries//
    var x=0;
    while (x<number){
        employees[x]=chukua.next()
        println("Enter" +employees[x]+"'s salary")
        salaries[x]=chukua.nextDouble()
        x++
    }
    //write the loop to print the names and salaries//
    var y=0
    while (y<number){
        println(employees[y]+"-------------Ksh." +salaries[y])
        y++
    }
}