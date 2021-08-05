import java.util.*

fun main(args: Array<String>) {
    var chukua = Scanner(System.`in`)
    println("How many students do you have?")
    var number = chukua.nextInt()
    var students = arrayOfNulls<String>(number)
    var adm = arrayOfNulls<String>(number)
    var marks = arrayOfNulls<Double>(number)
    println("Enter the $number students")
    //write loop to receive the names, admn no.s and marks//
    var x = 0;
    while (x<number) {
        students[x] = chukua.next()
        println("Enter " + students[x] + "'s admission")
        adm[x] = chukua.next()
        println("Enter " + students[x] + "'s marks")
        marks[x] = chukua.nextDouble()
        x++
    }
        //write loop to print the names, marks and admission numbers//
        var y = 0
        while (y<number){
            println(students[y]+"----"+marks[y]+"------"+adm[y])
            y++
        }

}