// 추상 클래스와 인터페이스 모두 ":" 를 사용
class Penguin(
    species: String,
) : Animal(species, 2), Swimable, Flyable {

    private val wingCount: Int = 2

    override fun move() {
        println("$species move")
    }

    // 프로퍼티에 대한 오버라이드를 할 때
    // 추상 프로퍼티가 아니라면, 상속받을 때 (추상 클래스의 프로퍼티에)open 을 붙여야 한다
    override val legCount: Int
        get() = super.legCount + this.wingCount // custom Getter

    override fun act() {
        super<Swimable>.act()
        super<Flyable>.act()
    }

    override val swimAbility: Int
        get() = 3
}