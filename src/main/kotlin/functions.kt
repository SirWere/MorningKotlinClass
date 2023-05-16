fun main(){
    //Predefined Functions

    println("Kotlin")

    var squareroot = Math.sqrt(81.0)
    println(squareroot)

    var round = Math.ceil(3.45)
    println(round)

    var round1= Math.round(3.45)
    println(round1)

    add(23,34)
    add(24,224)
    myFun()
    myDetails( "Brian", 19)
    myDetails( "Naruto", 25)
}

// User defined functions

fun myFun(){
    println("Today is Friday")
}

fun add(num1:Int,num2:Int){

    println(num1 + num2)
}

fun myDetails(name:String, age:Int){

    println("$name is $age years old")
}