package oop

import java.util.*

fun main(args: Array<String>) {
var take = Scanner(System.`in`)
    println("How many users do you have?")
    var number = take.nextInt()
    //instantiate the array//
    var users = arrayOfNulls<user>(number)
    println("Enter the $number user details")
    //write the loop to take the users details//
    var  x = 0
    while (x < number){
        println("Enter user "+(x+1)+" name")
        var name = take.next()
        println("Enter user "+(x+1)+" email")
        var email = take.next()
        println("Enter user "+(x+1)+" password")
        var password = take.next()
        users[x] = user(name,email,password)
        x++
    }
    //write the loop to display the users//
   for (user in users){
       if (user != null){
           println(user.name+"---"+user.email+"---"+user.password)
       }
    }
}
class user(name:String,email:String,password:String){
    var name:String
    var email:String
    var password:String

    init {
        this.name = name
        this.email = email
        this.password = password
    }
}
