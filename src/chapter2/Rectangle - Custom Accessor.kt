package chapter2
import java.util.Random

class Rectangle(val height: Int, val width: Int){
    val isSquare: Boolean
        get() = height == width // custom property accessor that is computed once
}

fun main(args: Array<String>) {
    val rectangle = Rectangle(2,2)
    println(rectangle.isSquare.toString())
}