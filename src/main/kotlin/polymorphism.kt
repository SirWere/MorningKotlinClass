open class Shape{
    open fun draw(){
        println("Drawing")
    }
}

class rectangle:Shape(){
    override fun draw(){
        println("Drawing a rectangle")
    }
}

class square:Shape(){
    override fun draw(){
        println("Drawing a square")
    }
}

fun main(){
    var r = rectangle()
    var s = square()

    r.draw()
    s.draw()
}