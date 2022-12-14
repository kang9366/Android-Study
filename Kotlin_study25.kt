fun main(){
    //object로 선언된 객체는 최초 선언시 자동으로 생성되며 이후에는 코드 전체에서 공용으로 사용될 수 있다.
    // --> 프로그램에서 공통적으로 사용될 객체를 만들 떄 사용하는 것이 좋다.
    println(Counter.count)
    Counter.countUp()
    Counter.countUp()
    println(Counter.count)
    Counter.clear()
    println(Counter.count)
}

object Counter{
    var count = 0
    fun countUp(){
        count++
    }
    fun clear(){
        count = 0
    }
}