fun main() {
    val score = 10
    if (score in 0..100) {}
}
fun getPassOrFail(score: Int): String {
    return if (score >= 50) {
        "P"
    } else {
        "F"
    }
}

fun judgeNumber(number: Int) {
    return when(number) {
        -1,0,1 -> println("어디서 많이 본 ~")
        else -> println("드문 숫자")
    }
}