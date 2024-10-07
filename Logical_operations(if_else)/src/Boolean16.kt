fun main() {
    println("A=")
    val A = readln().toInt()

    if((A>0) && (A % 2 ==0) && (A in 10..99)){
        println("Berilgan son ikki xonali juft son")
    }else{
        println("Berilgan son shartga tog'ri kelmadi")
    }
}