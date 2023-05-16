import java.util.Scanner

fun main(){
    var read = Scanner(System.`in`)

    println("Enter your name:")
    var name = readln()
    println("My name is $name")

    println("Enter an integer:")
    var num=read.nextInt()
    println("Entered $num")

    println("Enter a float:")
    var number=read.nextFloat()
    println("Entered $number")

    // Area

    println("Enter length:")
    var l = read.nextDouble()

    println("Enter width:")
    var w = read.nextDouble()

    println("Area ="+(l*w))
}
