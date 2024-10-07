fun main() {
    println("A=")
    val A = readln().toInt()
    println("B=")
    val B = readln().toInt()

    if (A % 2!=0 && B % 2!=0 ) {
        println("Berilgan sonlar juft")
    } else if (A % 2 != 0 || B % 2 != 0) {
        println("Berilgan sonlardan bittasi juft")
    } else {
        println("Berilgan sonlar toq")
    } 

}