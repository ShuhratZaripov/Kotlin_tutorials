fun main() {
    println("x1=")
    val x1 = readln().toInt()
    println("y1")
    val y1 = readln().toInt()
    println("x2=")
    val x2 = readln().toInt()
    println("y2")
    val y2 = readln().toInt()

    val dx = Math.abs(x2-x1)
    val dy = Math.abs(y2-y1)

    if (dx==1 && dy==2 || dx==2 && dy==1) {
        print("Ot yura oladi")
    }else{
        println("Ot yura olmaydi")
    }


}