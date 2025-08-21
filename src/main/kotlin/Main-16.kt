import com.lannstark.lec12.StringUtils

fun main() {
    3.add(4)

    // 기존 확장함수처럼 사용가능
    3.add2(4)
    // 이렇게도 사용 가능!!!!
    3 add2 4
}

fun Int.add(other: Int): Int {
    return this + other
}

infix fun Int.add2(other: Int): Int {
    return this + other
}

// String. <- String Class를 확장한다는 의미!
// this를 통해서 인스턴스에 접근 가능
fun String.lastChar(): Char {
    return this[this.length - 1]
}
