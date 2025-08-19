package lec01

fun main() {
    val str: String? = null
    println(str?.length)
    println(str?.length ?: 0)
}

fun startsWithA1(str: String?): Boolean {
    return str?.startsWith("A")
        ?: throw IllegalArgumentException("null 이 들어왔습니다")
}

fun startsWithA2(str: String?): Boolean? {
    return str?.startsWith("A")
}

fun startsWithA3(str: String?): Boolean {
    return str?.startsWith("A") ?: false
}

// !! <- 이 변수는 절때 Null이 아님을 표기
fun startsWith(str: String?): Boolean {
    return str!!.startsWith("A")
}