fun main(){
    //lateinit -> var의 늦은 초기화
    lateinit var x : String
    x = "initialized"
    println(x)

    //by lazy -> val의 늦은 초기화
    val y : String by lazy{ "initialized" }
    println(y)

    //by lazy의 활용
    lateinit var z : String
    val t : Int by lazy { z.length }
    z = "hello world"
    println(t)
}