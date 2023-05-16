fun main(){
    for (number in 10..15) {
        println(number)
    }
    for (letter in 'C'..'F'){
        println(letter)
    }
    for (num in 1..10){
        if(num > 5){
            break
        }
        println(num)
    }
    for (let in 'a'..'d'){
        if(let=='c'){
            continue
        }
        println(let)
    }
}