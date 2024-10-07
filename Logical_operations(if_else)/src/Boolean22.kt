fun main() {
    val number =  readln().toInt()

    val firstDigit = number / 100
    val secondDigit = (number /10) % 10
    val thirdDigit = number % 10

    if ((firstDigit < secondDigit && secondDigit < thirdDigit) || (firstDigit > secondDigit && secondDigit > thirdDigit)){
        println("Shart bajarildi")
    }else{
        println("Shart bajarilmadi")
    }
}