import java.util.Scanner

fun main() {
    var read = Scanner(System.`in`)

    //Volume

    println("Enter length:")
    var l = read.nextFloat()

    println("Enter width:")
    var  w = read.nextFloat()

    println("Enter height:")
    var h = read.nextFloat()

    var v = l*w*h
    println("Volume =$v")
}