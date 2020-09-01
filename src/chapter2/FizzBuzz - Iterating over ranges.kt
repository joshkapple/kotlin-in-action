package chapter2


fun fizzBuzz(i: Int){
    when {
        i % 15 == 0 -> println("$i Fizz buuzzz")
        i % 3 == 0 -> println("$i Fizzz")
        i % 5 == 0 -> println("$i buzzz")
        else -> println(i)
    }
}

fun main(){
    //(1..100).forEach({ fizzBuzz(it)})

    for(i in 100 downTo 1 step 2){
        fizzBuzz(i)}

    for (i in 1 until 10){println(i)}
}
