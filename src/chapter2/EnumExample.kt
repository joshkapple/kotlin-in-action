package chapter2

enum class Color(val r: Int, val g: Int, val b: Int) {
    RED(255,0,0), ORANGE(255,165,0), YELLOW(255,255,0), GREEN(0,255,0),
    BLUE(0,0,255), INDIGO(75,0,130), VIOLET(238,130,238); // semi-colon is language necessary here to seperate these constants from functions below

    fun rgb() = (r * 256 + g) * 256 + b
}

fun getMnemonic(color: Color) =
    when (color) {
        Color.RED ->  "Richard"
        Color.ORANGE -> "Of"
        Color.YELLOW -> "York"
        Color.GREEN -> "Gave"
        Color.BLUE -> "Battle"
        Color.INDIGO -> "In"
        Color.VIOLET -> "Vain"
    }

fun getWarmth(color: Color) = when(color){
    Color.RED, Color.ORANGE, Color.YELLOW -> "warm"
    Color.GREEN -> "nuetral"
    Color.BLUE, Color.INDIGO, Color.VIOLET -> "cold"
}

fun mix(c1: Color, c2: Color) = when (setOf(c1, c2)) {
    setOf(Color.RED, Color.YELLOW) -> Color.ORANGE
    setOf(Color.YELLOW, Color.BLUE) -> Color.GREEN
    setOf(Color.BLUE, Color.VIOLET) -> Color.INDIGO
    else -> throw Exception("Dirty color")
}

fun optimizedMix(c1: Color, c2: Color) = when {
    (c1 == Color.RED && c2 == Color.YELLOW) || (c1 == Color.YELLOW && c2 == Color.RED) -> Color.ORANGE
    else -> "im tired of colors"
}


fun main(){
    println(Color.RED.rgb())
    println(Color.ORANGE.rgb())
    println(Color.YELLOW.rgb())
    println(Color.GREEN.rgb())
    println(Color.BLUE.rgb())
    Color.values().forEach { color -> println(getMnemonic(color)) }
    val randomColor = Color.values().random()
    println("$randomColor is ${getWarmth(randomColor)}")

    println(mix(Color.BLUE, Color.BLUE))
}

