fun main() {
    println("Uch xonali son kiriting")
    val number = readln().toInt()

    val firstDigit = number / 100
    val secondDigit = (number / 10) % 10
    val thirdDigit = number % 10

    if (firstDigit != secondDigit && secondDigit != thirdDigit && firstDigit != thirdDigit){
        println("Berilgon uch xonali son raqamlari xar xil")
    } else{
        println("Xatolik")
    }
}