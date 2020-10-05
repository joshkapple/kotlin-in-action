package chapter7

import java.lang.IndexOutOfBoundsException

data class Point(val x: Int, val y: Int) {
    operator fun plus(other: Point): Point {
        return Point(x + other.x, y + other.y)
    }
    operator fun times(scale: Double): Point {
        return Point((x * scale).toInt(), (y * scale).toInt())
    }

    override fun equals(other: Any?): Boolean {
        if (other === this) return true
        if (other !is Point) return false
        return other.x == x && other.y == y
    }
}

operator fun Point.get(index: Int): Int{
    return when(index) {
        0 -> x
        1 -> y
        else -> throw IndexOutOfBoundsException("Invalid coordinate $index")
    }
}

data class MutablePoint(var x: Int, var y: Int)

operator fun MutablePoint.set(index: Int, value: Int){
    when (index){
        0 -> x = value
        1 -> y = value
        else -> throw IndexOutOfBoundsException("Invalid index $index")
    }
}

data class Rectangle(val upperLeft: Point, val lowerRight: Point)

operator fun Rectangle.contains(p:Point): Boolean {
    return p.x in upperLeft.x until lowerRight.x &&
            p.y in upperLeft.y until lowerRight.y
}

fun main(){
    val p1 = Point(10,20)
    val p2 = Point(30,40)

    val p3 = Point(10,20)

    println(p1 + p2)
    println(p3 * 2.5)

    println(Point(10,20) == Point(10,20))
    println(p2[0])

    val rect = Rectangle(Point(10,20), Point(50,50))
    println(Point(10,20) in rect)
    println(Point(5,5) in rect)
}

