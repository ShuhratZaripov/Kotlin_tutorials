fun main() {
    println("Hafta kunini sonda kiriting")
    val dayOfWeek = readln().toInt()

    when (dayOfWeek) {
        1 -> {
            println("Dushanba")
        }
        2 -> {
            println("Seshanba")
        }
        3 -> {
            println("Chorshanba")
        }
        4 -> {
            println("Payshanba")
        }
        5 -> {
            println("Juma")
        }
        6 -> {
            println("Shanba")
        }
        7 -> {
            println("Yakshanba")
        }
    }
}