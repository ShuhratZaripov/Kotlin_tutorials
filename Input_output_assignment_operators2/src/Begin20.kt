import kotlin.math.pow
import kotlin.math.sqrt

fun main() {
    println("x1")
    val x1 = readln().toDouble()
    println("x2")
    val x2 = readln().toDouble()
    println("y1")
    val y1 = readln().toDouble()
    println("y2")
    val y2 = readln().toDouble()
    val km = sqrt((x2-x1).pow(2) + (y2-y1).pow(2))
    println("Masofa $km")
}