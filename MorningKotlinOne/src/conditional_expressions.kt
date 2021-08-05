fun main(args: Array<String>) {
    var x: Int
    x=120
    var y = if (x<10){
      "X is less than 10"
    }else{
        "X is greater or equal to 10"
    }
    println(y)

    var marks=78
    var grade = if (marks<40){
        "E"
    }else if (marks<50){
        "D"
    }else if (marks<60){
        "C"
    }else if (marks<70){
        "B"
    }else{
        "A"
    }
    println(grade)

    var guessed_number = 0
    var result= when(guessed_number){
        1-> "Ooops!! You lost"
        2-> "Ooops!! You lost"
        3-> "Congrats, you won"
        4-> "Ooops!! You lost"
        else-> "Please enter any number from 1-4"
    }



}