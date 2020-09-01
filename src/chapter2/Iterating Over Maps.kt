package chapter2

import java.util.*



fun main() {
    val binaryReps = TreeMap<Char, String>()

    for (c in 'A'..'Z') {
        val binary = Integer.toBinaryString(c.toInt())
        binaryReps[c] = binary
    }

    for ((letter, binary) in binaryReps){
        println("$letter = $binary = ${letter.toInt()}")
    }
}
