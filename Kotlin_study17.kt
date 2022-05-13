//Null Safety
//--> Null에 대해서 안전하다(코틀린의 특징)
//
//휴지로 알아보는
//Null vs 0
//0 : 휴지를 다 쓰고 휴지심만 남은 상태
//Null : 휴지심도 없는 상태, 존재x
//
//Null이 안전하지 않은 이유
//0 + 10 = 10
//Null + 10 --> error
//null.setOnClickListener --> error
//아래 두 상황에서는 NullPointExceptionError가 발생한다.

//Null Safety가 없다면
//if(button. != null){
//    button.setOnClickListener
//}
//
//코틀린이 Null Safety하기 위해 사용하는 문법
//1. ?
//button?.setOnClickListener --> button이 null이 아니라면 setOnClickListener실행
//2. !!
//button!!.setOnClickListener --> button은 null이 아님을 개발자가 보장

//Int, Float, Double, Class --> Null이 될 수 없는 타입
//Int?, Float?, Double?, Class? --> Null이 될 수 있는 타입

fun main() {
    val number : Int = 10
//  val number1 : Int = null --> error 발생
    val number2 : Int? = null
//  val number3 = number2? + number --> 이러한 문법은 존재x
    val number3 = number2?.plus(number) //실행 x
//  삼항연산자(엘비스 연산자) --> 앞의 값이 null이 아니면 뒤의 값을 넣는다.
    val number4 = number2 ?: 10
    print(number4) //number2가 null이기 때문에 10반환
}

fun plus(a: Int, b: Int?): Int{
    return b?.plus(a)
    //b는 null이 될 수 있기 때문에 error 발생
}

fun plus2(a: Int, b: Int?): Int?{
    return b?.plus(a)
    //return type을 nullable로 설정해주면 error 발생 x
}