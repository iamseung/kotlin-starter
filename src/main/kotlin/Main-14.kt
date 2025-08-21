fun main() {
    val person1 = PersonDto("이승석", 100)
    val person2 = PersonDto("이승석", 100)
}

// data를 붙이게 된다면 Data Class로
// equals, toString, hashCode 자동 생성
data class PersonDto(
    val name: String,
    val age: Int,
)

fun handleCountry(country: Country) {
    // else 를 작성할 필요가 없음
    // ENUM 의 편화에 알림을 준다
    when (country) {
        Country.KOREA -> TODO()
        Country.AMERICA -> TODO()
    }
}

enum class Country(
    private val code: String,
) {
    KOREA("KO"),
    AMERICA("US")
}

sealed class HyundaiCar(
    val name: String,
    val price: Long,
)