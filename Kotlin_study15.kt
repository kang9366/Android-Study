//순수함수
fun sum(x:Int, y:Int): Int{
    return x+y
}

//람다
//람다의 기본 형식
//val lambdaName : Type = {argmentList -> codeBody}

val lambdaSum: (Int, Int) -> Int = {x, y ->
    x+y
}

val nameAge = {name: String, age: Int -> "My name is $name and I'm $age"}

//람다의 마지막 줄은 반환값이다.
val lambdaSum2: (Int, Int) -> Int = {x, y ->
    val sum = x+y
    sum
}

//매개변수가 없는 람다함수 --> 괄호를 꼭 써주어야 한다.
val lam: () -> Unit = {
    println("Hello world!")
}

//매개변수가 하나인 경우 "매개변수명 -> " 부분은 생략이 가능하고 함수 내부에서 사용할때에는 it으로 사용한다.
//단 매개변수가 2개 이상일때에는 생략이 불가능 하다.
val lam2: (String) -> Unit = {
    println(it)
}

//미사용 매개변수가 존재하는 경우에는 '_'으로 변수명 지칭을 생략 가능하다.
val lam3: (Int, Int, Int) -> Int = {x, y, _ ->
    x+y
}

fun Test(a:(Int, Int) -> Int, b:Int, c: Int) = println(a(b, c))


fun main(){
    Test(lambdaSum, 2, 3)
    //순수함수를 다른 함수의 매개변수로 호출할때에는 이름으로 호출이 불가능하다. '::'을 함수 이름앞에 붙혀서 호출
    Test(::sum, 2, 3)
    lam()
    lam2("Hello world!")
    println(lam3(1, 2, 3))
}
