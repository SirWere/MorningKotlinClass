class Person{
    //Variables/Properties/Attributes/Data members
    var name:String = "Brian"
    var age:Int = 31
    var location:String = "Nairobi"
    var yearOfBirth:Int = 1980

    //Methods/Functions

    fun eat(){
        println("Eating")
    }

    fun sleep(){
        println("Sleeping")
    }


}

fun main(){
    var teacher=Person()
    println(teacher.location)


    teacher.eat()
}