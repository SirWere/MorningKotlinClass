fun main(){
    val languages = arrayOf("Python", "Kotlin", "Java")

    languages[0]="JavaScript" // Changing an element

    println(languages[0]) // Accessing an element

    for (x in languages){
        println(x)
    }

    println(languages.size) // Checking the length of an array

    var language=languages.plus(element="C") // Adding an element in an array
    for (lang in language){
        println(lang)
    }
}