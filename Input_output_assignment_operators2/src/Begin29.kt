import kotlin.math.PI

fun main() {
    println("Gradusni kiriting")
    val degree = readln().toDouble()
    val radian = degree * (PI/180)
    println("$radian radian")
}