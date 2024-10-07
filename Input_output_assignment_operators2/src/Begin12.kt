import kotlin.math.sqrt

fun main() {
    val a = readln().toDouble()
    val b = readln().toDouble()
    val c = sqrt(a * a + b * b)
    val P = a + b + c
    println("Gipotenuzasi c=$c")
    println("Perimetri P=$P")
}