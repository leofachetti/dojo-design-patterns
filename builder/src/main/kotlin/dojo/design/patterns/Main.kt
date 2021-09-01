package dojo.design.patterns

class Main {
    val greeting: String
        get() {
            return "Hello Builder!"
        }
}

fun main() {
    println(Main().greeting)
}
