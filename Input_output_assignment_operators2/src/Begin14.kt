import kotlin.math.pow

fun main() {
    println("Aylananing yuzasi L=")
    val l = readln().toDouble()
    val PI = 3.14
    val R = l/(2*PI)
    val S = PI * R.pow(2)
    println("Radius=$R")
    println("Yuzasi=$S")
}