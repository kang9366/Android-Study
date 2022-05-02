//변수의 접근 범위
//1. 전역변수(global variable)
//2. 지역변수(local variable)

//전역변수 --> 모든곳에서 접근 가능
var number100: Int = 100

fun main(){

}

//클래스 지역변수(name) --> 클래스 내에서는 어디에서든지 사용 가능
class Test(var name: String){
    fun testFun1(){
        var birth: String = "1998/08/17" //함수 접근 변수 --> 함수 내에서만 사용가능
        name = "kang"
        number100 = 100 //전역 변수
    }

    fun testFun2(){
        //println(birth) --> birth는 testFun1 함수의 지역변수이기 떄문에 testFun2에서는 접근 불가
    }
}