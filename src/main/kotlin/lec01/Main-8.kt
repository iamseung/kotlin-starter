package lec01

fun main() {
    val person = Person("이승석", 30)
    println(person.name) // getter 바로 호출
    person.age = 10 // setter 바로 호출

    val person1 = Person("이승석")
}

class Person (
    val name: String,
    var age: Int
) {
    //  클래스 생성 시, 최초 1회 검증
    init {
        if (age < 0) {
            throw IllegalArgumentException("나이는 ${age}일 수 없습니다")
        }
    }

    fun isAdult(): Boolean {
        return this.age >= 20
    }

    val isAdult: Boolean
        get() = this.age >= 20

    // 추가 생성자, this -> 기본 생성자를 의미
    constructor(name: String): this(name, 1) {
        println("첫번째 부 생성자")
    }

    // 블락을 통해서 코드를 넣을 수 있다!
    constructor(): this("홍길동") {
        println("두번째 부 생성자")
    }
}