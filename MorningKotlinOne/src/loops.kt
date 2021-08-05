fun main(args: Array<String>) {
    //while loop
    var x:Int=0

    while (x<5){
        println(x)
        x++
    }
    var y:Int=10

    do {
        println(y)
        y++

    }while (y<15)

    //repeat loop
    repeat(10){
        println("Hello King")
    }

    //for loop
    var name= arrayOf("Jeff","Betty","Wayne","Becky","Sharon")
    for (jina in name){
        println(jina)
    }

  //10 to 1 use 10 downTo 1
    var numbers=1..10
    for (nambari in numbers){
        println(nambari)
    }
}