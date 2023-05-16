open class figure{
    var start:Boolean = true

    fun area(){
        println("Area")
    }

    fun perimeter(){
        println("Perimeter")
    }

    fun draw(){
        println("Draw")
    }
}

class Circle:figure(){
    var radius:Int = 78

}

class Rectangle:figure(){
    var width:Int = 7
    var height:Int = 8
}

class Square:figure(){
    var side:Int = 4
}

fun main(){
    var c = Circle()
    var r = Rectangle()
    var s = Square()

    c.area()
}