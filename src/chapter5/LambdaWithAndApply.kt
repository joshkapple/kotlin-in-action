package chapter5

fun alphabet(): String = with(StringBuilder()){// expression body syntax
        for (letter in 'A'..'Z') {
            this.append(letter)
        }
        append("\nNow I know my A B Cs!") // omitting this
        toString()
}

// This version uses apply to return the object passed to it
fun alphabetApply() = StringBuilder().apply{
    for(letter in 'A'..'Z'){
        append(letter)
    }
    append("\nNow I my A! B! Cssssssssss!")
}

fun main(){
    println(alphabet())
    println(alphabetApply().toString())
}
