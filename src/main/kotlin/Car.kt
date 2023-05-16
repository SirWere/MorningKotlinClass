class car{
    var make:String="Volkswagen"
    var model:String="Golf R MK7"
    var color:String = "Black"
    var drivingSpeed:Int = 220

    fun drive(){
        println("Driving")
    }

    fun turn(){
        println("Turning")
    }

    fun stop(){
        println("Stopping")
    }
}

fun main(){
    var polo = car()
    println(polo.make+" "+polo.model+" "+polo.color+" "+polo.drivingSpeed)

    polo.turn()
}