fun main() {
    println("A=")
    val A = readln().toInt()
    println("B=")
    val B = readln().toInt()

    if (A % 2 != 0 && B % 2 != 0){
        println("Ikki son ham toq")
    }
    else if(A % 2 != 0 || B % 2 != 0){
        println("Ikki sondam bittasi toq")
    }
    else {
        println("Toq son mavjud emas")
    }
}