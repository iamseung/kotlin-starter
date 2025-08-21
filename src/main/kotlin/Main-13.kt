fun main() {

}

class Javahouse(
    private val address: String,
    private val livingRoom: LivingRoom,
) {
    // 편하게 작성하지만 static 중첩 클래스로 생성됨
    // 코틀린에선 기본적으로 바깥 클래스에 대한 연결이 없는 중첩 클래스가 생성됨
    class LivingRoom(
        private var area: Double,
    )
}

class House(
    private val address: String,
    private val livingRoom: LivingRoom,
) {
    // 바깥 클래스에 대한 참조를 가지고 있는, 권장되지 않는 클래스 안의 클래스
    inner class LivingRoom(
        private var area: Double,
    ) {
        // 바깥클래스 참조를 위해
        // this@{상위클래스타입}.{프로퍼티}
        val address: String
            get() = this@House.address
    }
}
