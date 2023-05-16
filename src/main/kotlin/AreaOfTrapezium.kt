import java.util.Scanner

fun main() {
    var read = Scanner(System.`in`)

    //Area of a Trapezium

    println("Enter height:")
    var h = read.nextFloat()

    println("Enter length a:")
    var a = read.nextFloat()

    println("Enter length b:")
    var b = read.nextFloat()

    var area = 0.5*(a+b)*h
    println("Area =$area")
}