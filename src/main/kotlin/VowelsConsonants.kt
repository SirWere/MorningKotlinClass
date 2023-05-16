import java.util.Scanner

fun main(){
    var read = Scanner(System.`in`)

    // Vowels and Consonants

    println("Enter a letter:")

    var ch:Char = read.next().single()

    if ( ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ){
        println{"$ch is a vowel"}
    }
    else{
        println("$ch is a consonant")
    }
}