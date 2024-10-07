import kotlin.math.abs

fun main() {
    println("Nolga teng bo'lmagan son kiritng a=")
    val a = readln().toInt()
    println("Nolga teng bo'lmagan son kiting b=")
    val b = readln().toInt()
    val sum = a + b
    val mul = a * b
    val mod = abs(a)
    val abs = abs(b)

    println("Yig'indisi $sum")
    println("Ko'paytmasi $mul")
    println("Birinchi son moduli $mod")
    println("Ikkinchi son moduli $abs")
}
