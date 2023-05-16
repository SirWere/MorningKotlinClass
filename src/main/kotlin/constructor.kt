class Dog(var color:String,var breed:String,var sex:String,var age: Int){

}

fun main(){
    var d=Dog("black","German Shepherd","Female",7)
    println(d.color+" "+d.breed+" "+d.sex+" "+d.age)

    var puppy=Dog("brown","German Shepherd","Male", 1)
    println(puppy.color+" "+puppy.breed+" "+puppy.sex+" "+puppy.age)
}