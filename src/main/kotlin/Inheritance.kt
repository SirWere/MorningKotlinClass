open class Animal{
    var age:Int = 21
    var gender:String = "Male"
    fun mammal(){
        println("This animal is a mammal")
    }
}

class Duck:Animal(){
    var colour:String = "Grey"
    fun swim(){
        println("This animal can swim")
    }
}

class Fish:Animal() {
    var canEat: Boolean = true
        fun swim() {
            println("This animal can swim")
        }
}
class Horse:Animal(){
    var isWild: Boolean = false
        fun run() {
            println("This animal can run")
        }
    }

fun main(){
    var d=Duck()
    println(d.gender)
    var h=Horse()
    h.mammal()
    var f=Fish()
    println(f.age)
}

