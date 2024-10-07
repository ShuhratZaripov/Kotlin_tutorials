fun main() {
    println("Baho=")
    val b = readln().toInt()

    when {
        b == 1 -> {
            println("yomon")
        }
        b ==2 -> {
            println("qonirasiz")
        }
        b ==3 -> {
            println("qoniqarli")
        }
        b ==4 -> {
            println("yaxshi")
        }
        b ==5 -> {
            println("a'lo")
        }
        b >= 5 -> {
            println("xato")
        }
    }
}