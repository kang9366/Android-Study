class MyClass {
    var data = 10
    fun some(){
        println(data)
    }

    companion object {
        var data2 = 10
        fun some2(){
            println(data2)
        }
    }
}

fun main(){
//  일반 클래스는 클래스명으로 멤버변수나 함수에 접근 불가능하고 객체를 생성해서 접근해야한다
//  MyClass.obj = 20
//  MyClass.some()
    val obj = MyClass()
    obj.data = 20
    obj.some()

//  동반객체로 선언된 멤버변수와 함수는 클래스 명으로 접근이 가능하다.
    MyClass.data2 = 20
    MyClass.some2()
}