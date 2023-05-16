import java.util.Scanner

fun main(){
    var read = Scanner(System.`in`)

    println("Enter number:")
    var num = read.nextInt()

    if (num<0){
        println("$num is a negative number")
    }
    else if(num==0){
        println("$num is neither a positive or a negative number")
    }
    else{
        println("$num is a positive number")
    }
}