import java.util.Scanner

fun main() {
    var read = Scanner(System.`in`)

    //Perimeter of a circle

    val pi = 3.142

    println("Enter radius:")
    var r = read.nextFloat()

    var p = 2*pi*r
    println("Perimeter =$p")
}