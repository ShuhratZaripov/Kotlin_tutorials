import kotlin.math.pow

fun main() {
    println("x=")
    val x = readln().toDouble()
    val y = 3*x.pow(5) - 6* x.pow(2) - 7
    println("y=$y")
}