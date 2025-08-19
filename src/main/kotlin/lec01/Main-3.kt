package lec01

import com.lannstark.lec03.Person

fun stringFormatting() {
    val person = Person("이승석", 100)
    println("${person.name}(${person.age})")
}

fun stringFormatting2() {
    val str = """
        ABC
        EFG
        ZCS
        SEX
    """.trimIndent()
    println(str)
}

fun charAt() {
    val str = "ABCDE"
    str[0]
}

fun main() {
    val number1 = 3
    val number2: Long = number1.toLong()

    stringFormatting2()
}

fun printAgeIfPerson(obj: Any) {
    if (obj is Person) {
        val person = obj as Person
        println(person.age)
    }
}

fun printAgeIfPerson2(obj: Any?) {
    // Null 체크
    val person = obj as? Person
    println(person?.age)
}