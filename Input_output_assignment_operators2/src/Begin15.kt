fun main() {
    println("A=")
    val A = readln().toInt()
    println("B=")
    val B = readln().toInt()
    println("C=")
    val C = readln().toInt()
    val AC = C - A
    val BC = C - B
    val sum = AC + BC
    println("AC=$AC")
    println("BC=$BC")
    println("Kesmalar yig'indisi $sum")
}