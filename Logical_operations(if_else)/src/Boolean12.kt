fun main() {
    println("A=")
    val A = readln().toInt()
    println("B=")
    val B = readln().toInt()
    println("C=")
    val C = readln().toInt()

    if (A>0 && B>0 && C>0){
        println("Berilgan sonlarning hammasi musbat")
    }
    else{
        println("Berilgan sonlarning hammasi ham musbat emas")
    }
}