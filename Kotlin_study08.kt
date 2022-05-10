//framework가 제공하지 않는 것을 만든다.
fun main(){
    //클래스를 통해 실체를 만드는 과정 --> 인스턴스화 (인스턴스 = 객체)
    Car(engine = "v8 engine", body = "big")
    val bigCar = Car("v8 engine", "big")
    val superCar : SuperCar = SuperCar("good engine", "big", "white")
    val runnableCar: RunnableCar = RunnableCar(engine = "simple engine", "small")

    runnableCar.drive()
    runnableCar.ride()
    runnableCar.navi("Seoul")
    //RunnableCar.ride() -> 불가능, 반드시 객체를 만들고 객체를 통해 접근해야함

    //인스턴스(객체)의 멤버변수에 접근하는 방법
    val runnableCar2: RunnableCar2 = RunnableCar2("nice engine", "mideum")
    println("engine of runnableCar2 is ${runnableCar2.engine}")
    println("body of runnableCar2 is ${runnableCar2.body}")
}

//클래스 만드는 방법1
class Car(var engine:String, var body:String){
    //생성자 필요x, 변수도 알아서 초기화됨
}

//클래스 만드는 방법2
class SuperCar{
    var engine : String
    var body : String
    var door : String
    //생성자
    constructor(engine : String, body : String, door : String){
        this.engine = engine
        this.body = body
        this.door = door
        println(engine)
        println(body)
        println(door)
    }
}

//클래스 만드는 방법3 (1번 방법의 확장, overloading)
class Car1(engine:String, body:String){
    var door: String = ""

    constructor(engine: String, body: String, door: String):this(engine, body){
        this.door = door
    }
}

//클래스 만드는 방법4 (2번 방법의 확장, overloading)
class Car2{
    var engine: String = ""
    var body: String = ""
    var door: String = ""

    //생성자가 여러개일지라도 overloading을 통해 해결가능
    constructor(engine: String, body: String){
        this.engine = engine
        this.body = body
    }

    constructor(engine: String, body: String, door: String){
        this.engine = engine
        this.body = body
        this.door = door
    }
}

class RunnableCar(engine: String, body: String){
    //class의 기능은 함수로 구현
    fun ride(){
        println("탑승 하였습니다.")
    }
    fun drive(){
        println("달립니다.")
    }
    fun navi(destination : String){
        println("$destination 으로 목적지 설정")
    }
}

class RunnableCar2{
    var engine: String
    var body: String
    constructor(engine: String, body: String){
        this.engine = engine
        this.body = body
    }

    //인스턴스화 될 때 가장 먼저 실행되는 부분
    init {
        println("Runnable Car2 생성")
    }

    fun ride(){
        println("탑승 하였습니다.")
    }
    fun drive(){
        println("달립니다.")
    }
    fun navi(destination : String){
        println("$destination 으로 목적지 설정")
    }
}
