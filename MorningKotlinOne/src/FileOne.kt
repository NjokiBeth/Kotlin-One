fun main(args: Array<String>) {
    println("Hello Kotlin")
    //variables
    var name: String
    var age:Int

    val first_name:String
    val airtime:Int

    name="King"
    age=300
    name="Jeff"
    age=400

    println("Hey $name, you are $age years old")

    first_name="Betty"
    airtime=9000
    //first_name=8000, impossible, you cant declare a value more than once using val//
    println("Hello $first_name, you won $airtime safaricom airtime")

}