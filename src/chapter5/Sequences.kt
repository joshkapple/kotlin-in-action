package chapter5


object SequenceStuff {
    val alot = 1 .. 10000
    val foo = alot.asSequence().map({i -> i * i}).filter{i -> i % 2 == 0}

    val reallyAlot = 1 .. 10000000
    val bar = reallyAlot.asSequence().map{it * it}.find{it > 17}

    val naturalNumbers = generateSequence(0){it + 1 }
    val numbersTo100 = naturalNumbers.takeWhile {it <= 100}

}

fun main(){
    println(SequenceStuff.foo.toList())
    println(SequenceStuff.bar)
    println(SequenceStuff.numbersTo100.toList())
}

