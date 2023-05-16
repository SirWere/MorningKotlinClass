import java.util.Scanner

fun main(){
    var read = Scanner(System.`in`)

    //Maximum number

    println("Enter num1:")
    var num1 = read.nextInt()

    println("Enter num2:")
    var num2 = read.nextInt()

    println("Enter num3:")
    var num3 = read.nextInt()

    if (num1>num2 && num1>num3){
        println("$num1 is the largest")
    }
    else if(num2>num1 && num2>num3){
        println("$num2 is the largest")
    }
    else{
        println("$num3 is the largest")
    }

}