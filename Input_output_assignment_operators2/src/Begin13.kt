import kotlin.math.PI
import kotlin.math.pow

fun main() {
    println("R1=")
    val r1 = readln().toDouble()
    println("R2=")
    val r2 = readln().toDouble()
    if (r1 > r2) {
        val s1 = PI*r1.pow(2)
        val s2 = PI*r2.pow(2)
        val s3 = s1-s2
        println("s1=$s1")
        println("s2=$s2")
        println("s3=$s3")
    } else {
        println("Xatolik! R1<R2 ekan")
    }
}