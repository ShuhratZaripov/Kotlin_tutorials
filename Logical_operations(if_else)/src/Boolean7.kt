fun main() {
    println("A")
    val A = readln().toInt()
    println("B")
    val B = readln().toInt()
    println("C")
    val C = readln().toInt()

    if (A<B && B<C) {
        println("B soni A va C sonlari orasida yotadi")
    } else {
        println("B soni A va C sonlari orasida yotmaydi")
    }
}