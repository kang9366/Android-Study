fun main(){
    helloWorld()
    println(add(4, 1))
}

//function
//변수명은
//return 값이 void일 때는 return type 생략 가능
fun helloWorld(){
    println("Hello World!")
}

fun add(a: Int, b: Int) : Int{
    return a+b
}