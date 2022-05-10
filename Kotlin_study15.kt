//lambda
//람다식은 value처럼 다룰 수 있는 익명함수이다.
//1. 함수를 메소드의 파라미터로 넘겨줄 수 있다.
//2. 함수를 함수의 return값으로 사용할 수 있다.

//람다의 기본 형식
//val lambdaName : Type = {argmentList -> codeBody}

val square : (Int) -> (Int) = {number -> number*number}
//input과 return값의 타입은 생략 가능
val nameAge = {name: String, age: Int -> "My name is $name and I'm $age"}

//람다의 return
val calculateGrade: (Int) -> String = {
    when(it){
        in 0..40 -> "fail"
        in 41..70 -> "pass"
        in 71..100 -> "perfect"
        else -> "Error"
    }
}

//람다를 표현하는 여러가지 방법
fun invokeLambda(lambda: (Double) -> Boolean): Boolean{
    return lambda(5.37)
}


//확장함수
val pizzaIsGreat : String.() -> String = {
    this + "Pizza is the best!"
}

fun main(){
    //람다
    println(square(10))
    println(nameAge("kang", 25))
    println(calculateGrade(97))

    //확장함수
    val a = "kim said "
    val b = "lee said "
    println(a.pizzaIsGreat())
    println(b.pizzaIsGreat())
}
