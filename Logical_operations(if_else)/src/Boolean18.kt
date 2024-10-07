fun main() {
    println("A=")
    val A = readln().toInt()
    println("B=")
    val B = readln().toInt()
    println("C=")
    val C = readln().toInt()

    if (A==B || B==C || A==C){
        println("Berilgan sondan ikkitasi bir-biriga teng")
    }else{
        println("Shart bajarilmadi")
    }
}