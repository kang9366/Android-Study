data class People(val name: String, val age: Int)

fun main() {
    val p1 = People("kang", 25)
    val p2 = People("kang", 25)

    //toString
    println(p1)

    //copy
    val p3 = p1.copy(name = "kim")
    val p4 = p2.copy(age = 20)
    //p1에서 이름이 변경
    println(p3)
    //p2에서 나이가 변경
    println(p4)

    //hash code
    println(p1.hashCode())
    println(p2.hashCode())

    //equal
    println(p1==p2)
    println(p1===p2)

    //componentN
    val (name, age) = p1
    println("p1 : $name, $age")
}
