fun main(){
    val testAcess: TestAcess = TestAcess("kim")
    //private키워드는 클래스 외부에서의 접근을 막아준다.
    //testAcess.test()
    //println(testAcess.name)
    //testAcess.name = "lee"
}

class TestAcess{
    //private키워드는 클래스 내에서만 접근 가능
    private var name: String = "kang"
    constructor(name: String){
        this.name = name
    }

    private fun test(){
        println("test")
    }
}
