import java.util.Scanner

fun main() {
    var read = Scanner(System.`in`)

    //Perimeter

    println("Enter length:")
    var l = read.nextFloat()

    println("Enter width:")
    var w = read.nextFloat()

    var p = 2*(l+w)
    println("Perimeter =$p")
}