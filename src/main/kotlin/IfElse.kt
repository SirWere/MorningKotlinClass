import java.util.Scanner

fun main(){
    var read = Scanner(System.`in`)

    //Temperature

    println("Enter temperature:")
    var t = read.nextInt()

    if (t<37){
        println("It is too cold")
    }
    else if(t == 37){
        println("Normal temperature")
    }
    else{
        println("It is too hot")
    }
}