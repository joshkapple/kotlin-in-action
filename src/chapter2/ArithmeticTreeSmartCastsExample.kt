package chapter2

import java.lang.IllegalArgumentException

interface Expr

class Num(val value: Int): Expr
class Sum(val left: Expr, val right: Expr): Expr

fun eval(e: Expr): Int {
    return when (e) {
        is Num -> e.value
        is Sum -> eval(e.right) + eval(e.left)
        else -> throw IllegalArgumentException("Unknown expression")
    }
}

fun main(){
    println(eval(Num(1)))
    println(eval(Sum(Num(2), Num(3))))
    println(eval(Sum(Num(3), Sum(Num(1), Sum(Num(1), Num(2))))))
}


