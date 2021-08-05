package oop

fun main(args: Array<String>) {
   var user1= Admin("king@gmai;.com", "123")
    user1.login()
}
open class Normaluser(open var email:String, open var password:String){
    fun login(){
        println("Yeah, I can log in")
    }
    fun access_portal(){
        println("Yeah, I can access the students' portal")
    }
}
class Admin(override var email: String,
            override var password: String)
    :Normaluser(email, password){
    fun add_users(){
        println("Yeah, I can add users")
    }
    fun suspend_students(){
        println("Yeah, I can suspend a student")
    }
}


