import kotlin.math.pow
import kotlin.math.sqrt
import kotlin.system.exitProcess

fun main() {
    println("A=")
    val A = readln().toDouble()
    println("B=")
    val B = readln().toDouble()
    println("C=")
    val C = readln().toDouble()
    val D = B.pow(2) - 4*A*C
    val x1 = (B.pow(2)+ sqrt(D))/2*A*C
    val x2 = (-B.pow(2)+ sqrt(D))/2*A*C

    A!= 0.toDouble()

    if (x1 != 0.toDouble() || x2 != 0.toDouble()){
        println("shart bajarildi")
    }else{
        println("shart bajarilmadi")
    }
}
