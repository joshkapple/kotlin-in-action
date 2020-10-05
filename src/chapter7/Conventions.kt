package chapter7

data class Point(val x: Int, val y: Int){
    operator fun plus(other: Point): Point{
        return Point(x + other.x, y + other.y)
    }
    operator fun times(scale: Double): Point{
        return Point((x * scale).toInt(), (y * scale).toInt())
    }
}



fun main(){
    val p1 = Point(10,20)
    val p2 = Point(30,40)

    val p3 = Point(10,20)

    println(p1 + p2)
    println(p3 * 2.5)

}

