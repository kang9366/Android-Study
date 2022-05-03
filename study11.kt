//똑같은 기능이 두번이상 반복되면 refactoring하는 것이 좋다!
//class의 기본 접근제어자는 private이기 때문에 상속을 할 때 부모클래스의 접근제어자는 자식클래스에서 접근이 가능하도록 open으로 설정해야한다.

fun main(){
    val superCar: SuperCar = SuperCar()
    superCar.stop()
    println(superCar.drive())
}

open class Car() {
    open fun drive(): String{
        return "drive"
    }

    fun stop(){
        println("stop")
    }
}

class SuperCar() : Car(){
    //부모클래스의 기능과 자식클래스의 기능이 아주 유사할 때
    override fun drive(): String {
        //super --> 부모클래스의 메소드 호출
        super.drive()

        val run = super.drive()
        return "$run fast"
    }
}