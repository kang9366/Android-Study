//overloading : 메소드의 이름은 동일하지만 매개변수를 다르게 선언함으로써 여러개의 동일이름을 가진 메소드를 만드는 것
fun add_two(a: Int, b: Int): Int = a + b
fun add_three(a: Int, b: Int, c: Int) = a + b + c
fun add_four(a: Int, b: Int, c: Int, d: Int) = a + b + c + d

//overriding : 상위 클래스가 가지고 있는 메소드를 하위 클래스에서 재정의 하는 것
//메소드 이름은 물론 인자 갯수나 타입도 동일해야 한다.
//주로 상위 클래스의 동작을 상속받은 하위클래스에서 메소드의 동작을 변경하기 위해 사용된다.
open class Parent{
    open fun ex() {
        println("this is parent")
    }
}

class Child: Parent(){
    override fun ex(){
        println("this is child")
    }
}


fun main(){
    println(add_two(1, 2))
    println(add_three(1, 2, 3))
    println(add_four(1, 2, 3, 4))

    val parent = Parent()
    val child = Child()
    parent.ex()
    child.ex()
}