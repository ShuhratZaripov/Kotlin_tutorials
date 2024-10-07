fun main() {
    println("kanfet X kg sini kiriting")
    val X = readln().toInt()
    println("X kg kanfet A narxini kiriting")
    val A = readln().toInt()
    val kg = A/X
    println("Y kg ni kiting")
    val Y = readln().toInt()
    val Ykg = Y * kg
    println("Y kg konfet narxi: $Ykg")
    println("1 kg konfet narxi: $kg")
}