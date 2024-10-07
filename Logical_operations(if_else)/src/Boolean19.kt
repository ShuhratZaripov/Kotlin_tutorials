fun main() {
    println("A=")
    val A = readln().toInt()
    println("B=")
    val B = readln().toInt()
    println("C=")
    val C = readln().toInt()

    if ((A==-B && B==-A) || (A==-C && C==-A) || (C==-B && B==-C)){
        println("Berilgan sonlarni bir jufti o'ziga qarama qarshi")
    }
    else{
        println("Shart bajarilmadi")
    }
}