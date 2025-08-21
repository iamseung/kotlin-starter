import com.lannstark.lec12.StringUtils
import com.lannstark.lec17.Fruit

fun main() {
    var fruits = listOf(
        Fruit("사과", 1_000),
        Fruit("사과", 1_200),
        Fruit("사과", 1_200),
        Fruit("사과", 1_500),
        Fruit("바나나", 3_000),
        Fruit("바나나", 3_200),
        Fruit("바나나", 2_500),
        Fruit("수박", 10_000),
    )

    // 람다를 만드는 방법1
    // 이름없는 함수, 람다(함수명 X)
    // val isApple = fun(fruit: Fruit): Boolean {
    val isApple: (Fruit) -> Boolean = fun(fruit: Fruit): Boolean {
        return fruit.name == "사과"
    }

    // 람다를 만드는 방법2
    // 익명함수
    // val isApple2 = { fruit: Fruit -> fruit.name == "사과"}
    val isApple2: (Fruit) -> Boolean = { fruit: Fruit -> fruit.name == "사과"}

    // 람다를 직접 호출하는 방법1
    isApple(fruits[0])
    // 람다를 직접 호출하는 방법2
    isApple.invoke(fruits[0])

    // 호출방법 1
    filterFruits(fruits, isApple)
    // 호출방법 2
    filterFruits(fruits, { fruit: Fruit -> fruit.name == "사과"})
    // 호출방법 3, 그 함수에서 받는 함수 파라미터가 마지막에 위치해있으면, 중괄호를 밖으로 뺄 수 있다
    filterFruits(fruits) { fruit: Fruit -> fruit.name == "사과"}
    filterFruits(fruits) { fruit -> fruit.name == "사과"} // 타입을 추론할 수 있기 때문에 Fruit 생략 가능
    filterFruits(fruits) { it.name == "사과"} // 파라미터가 한개일 경우 it 로 치환 가능
}

private fun filterFruits(
    fruits: List<Fruit>,
    filter: (Fruit) -> Boolean,
): List<Fruit> {
    val result = mutableListOf<Fruit>()
    for (fruit in fruits) {
        if (filter(fruit)) {
            result.add(fruit)
        }
    }

    return result
}
