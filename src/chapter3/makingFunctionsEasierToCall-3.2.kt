package chapter3

fun <T> Collection<T>.joinToString(separator: String = ", ", prefix: String = "", postfix: String = ""): String {
    val result = StringBuilder(prefix)
    for ((index, element) in this.withIndex()){
        if (index > 0 ) result.append(separator)
        result.append(element)
    }
    result.append(postfix)
    return result.toString()
}

// an extension function
fun String.lastChar():Char = this.get(this.length - 1)

// an extension property
val String.lastChar:Char
    get() = get(length -1)

fun main(){
    val list = listOf(1, 2, 3)
    println(list.joinToString(";", "(", ")"))
    println("blaaaaaaaaal".lastChar)
}
