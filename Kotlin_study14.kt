abstract class Animal{
    abstract fun eat()
    fun sleep(){
        println("잠자기")
    }
}

class Rabbit: Animal(){
    override fun eat() {
        println("당근 먹기")
    }
}

class Tiger: Animal(){
    override fun eat() {
        println("고기 먹기")
    }
}

fun main(){
    val rabbit: Rabbit = Rabbit()
    val tiger: Tiger = Tiger()

    rabbit.eat()
    rabbit.sleep()
}