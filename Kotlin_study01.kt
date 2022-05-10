fun main(){
    helloWorld()
    println(add(4, 1))
    
    //두번재 매개변수는 default값이기 때문에 함수를 호출할때 첫번째 매개변수의 값만 넘겨주어도 된다.
    //두번째 매개변수에 값을 전달한다면 default값이 전달한 값으로 바뀜
    println(plusFive(2))
    plusMany(1, 2, 3)
}

//function
//return 값이 void일 때는 return type 생략 가능
fun helloWorld(){
    println("Hello World!")
}

//return 값이 존재하는 경우에는 반드시 return type 명시
fun add(a: Int, b: Int) : Int{
    return a+b
}

//defalut값을 갖는 함수
fun plusFive(first: Int, second: Int = 5): Int{
    val result = first + seocnd
    return result
}

//간단하게 함수를 선언하는 방법
fun plusShort(first:Int, second: Int) = first+second

//가변인자를 갖는 함수
fun plusMany(vararg numbers: Int){
    for(number in numbers){
        println(numbers)
    }
}
