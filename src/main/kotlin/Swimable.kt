interface Swimable {

    val swimAbility: Int

    val swimAbility2: Int
        get() = 3

    // default Method (default 생략 가능)
    fun act() {
        println("Swimable act")
    }
}