class dog(var Breed:String, var Size:String, var Age:Int, var Color:String){
    fun eat(food:String){
        println(food)
    }

    fun sleep(action:String){
        println(action)
    }

    fun sit(action:String){
        println(action)
    }

    fun run(action:String){
        println(action)
    }
}

fun main(){
    var d1=dog("Neapolitan Mastiff", "Large", 5, "Black")
    println(d1.Breed+" "+d1.Size+" "+d1.Age+" "+d1.Color)
    d1.eat("Dog Biscuits")
    d1.sleep("Sleeping")


    var d2=dog("Maltese", "Small", 2, "White")
    println(d2.Breed+" "+d2.Size+" "+d2.Age+" "+d2.Color)
    d2.eat("Dog pellets")
    d2.run("Running")

    var d3=dog("Chow chow", "Medium", 3, "Brown")
    println(d3.Breed+" "+d3.Size+" "+d3.Age+" "+d3.Color)
    d3.eat("Dog rice")
    d3.sit("Sitting")
}