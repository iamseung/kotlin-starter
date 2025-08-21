import com.lannstark.lec12.Movable

fun main() {
    // 익명 클래스
    moveSomething(object : Movable {
        override fun move() {
            TODO("Not yet implemented")
        }

        override fun fly() {
            TODO("Not yet implemented")
        }

    })
}

private fun moveSomething(movable: Movable) {
    movable.fly()
    movable.move()
}
