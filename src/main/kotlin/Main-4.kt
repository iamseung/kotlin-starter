import com.lannstark.lec04.JavaMoney

fun main() {
    val money1 = JavaMoney(1_000L)
    val money2 = money1
    val money3 = JavaMoney(1_000L)


    // Java와 다르게 객체를 비교할때
    // 비교 연산자를 사용하면 자동으로 compareTo를 호출
    if (money1 > money2) {
        println("Money1 > Money2")
    }

    println(money1 == money3) // equals
    println(money1 === money3) // 주소값 비교
}