//제너릭 : 다양한 타입의 객체들을 다룬느 메서드나 컬렉션 클래스에서 컴파일 시에 타입을 체크해주는 기능
//제너릭은 만들기 어렵고 실제로 만들일이 거의 없기 때문에 사용하는 방법만 숙지하면 된다.

fun main(){
    //제너릭을 사용하지 않는 경우 --> 형변환을 해야한다.
    val list1 = listOf(1, 2, 3, "가")
    val b: String = list1[2].toString() //형변환

    //제너릭을 사용하는 경우 --> 타입이 안전하다.
    val list2 = listOf<String>("a", "b", "c")
    val c: String = list2[2] //String이라는 것을 보장받는다.

    //강한 타입을 체크할 수 있다.
    val list3 = listOf(1, 2, 3, 4, "가", "나", 3.0)
    val list4 = listOf<Int>(1, 2, 3, "가") //강한 타입체크
}