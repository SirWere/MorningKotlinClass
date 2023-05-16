open class shape{
    open fun area(){
        println("Area")
    }
}

class circle:shape(){
    override fun area(){
        println("Area of a circle")
    }
}

class triangle:shape(){
    override fun area(){
        println("Area of a triangle")
    }
}

class rectangle1:shape(){
    override fun area(){
        println("Area of a rectangle")
    }
}

fun main(){
    var c = circle()
    var t = triangle()
    var r = rectangle1()

    c.area()
    t.area()
    r.area()
}