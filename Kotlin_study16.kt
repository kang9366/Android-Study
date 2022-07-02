class Person(var name: String){
    operator fun invoke(){
        println("name : $name")
    }
}

class Calculator{
    fun plus(a:Int, b:Int) = a+b
    fun minus(a:Int, b:Int) = a-b
}

fun Calculator.plus(a:Int, b: Int, c: Int) = a + b + c

fun main(){
    val person = Person("kang")
    person()
    val cal = Calculator()
    val a = cal.plus(1, 2)
    println(a)

}
