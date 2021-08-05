package oop

import java.util.*

fun main(args: Array<String>) {
    //create an object from the class//
    var car1:car
    car1= car()
    println(car1.color)

    var car2 = car()
    println(car2.manufacture)
    car1.accelerate()
    car2.brake()
    var std1 = student("Jeff", "jeff@gmail.com", "M","AMD001", 120)
    println(std1.adm_no)
    std1.displayDetails()

    var chukua = Scanner(System.`in`)
    println("Enter employee name")
    var jina = chukua.next()
    println("Enter employee number")
    var mshahara = chukua.nextDouble()
    println("Enter employee number")
    var sajili = chukua.next()
    var mfanyikazi1 = employees(jina,mshahara,sajili)
    println(mfanyikazi1.name)
    println(mfanyikazi1.salary)
    println(mfanyikazi1.empnumber)


}
class car{
    var color = "Maroon"
    var wheels = 24
    var drive_type = "Left"
    var manufacture = "Mercedes"
    fun accelerate(){
        println("Yeah, I can accelerate")
    }
    fun brake(){
        println("Yeah, I can brake")
    }
}
class student(name:String, email:String, gender:String, adm_no:String, age:Int){
    //these are properties//
    var name:String
    var email:String
    var gender:String
    var adm_no:String
    var age:Int

    //this is the constructor//
    init {
        this.name = name
        this.email = email
        this.gender = gender
        this.adm_no = adm_no
        this.age = age

    }
    fun displayDetails(){
        println("Hello $name, your email is $email")
    }
}


class employees(name:String,salary:Double,empnumber:String){
    //properties
    var name:String
    var salary:Double
    var empnumber:String

    init {
        this.name = name
        this.empnumber = empnumber
        this.salary = salary
    }

}