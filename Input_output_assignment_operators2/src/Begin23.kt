import java.security.Principal

fun main() {
    println("A:")
    var A = readln().toInt()
    println("B:")
    var B = readln().toInt()
    println("C:")
    var C = readln().toInt()

    println("Avvalgi sonlar")
    println("A:$A, B:$B, C:$C")

    A = B.also { B = C.also {C = A}  }
    println("O'zgarishi")
    println("A:$A, B:$B, C:$C")
}