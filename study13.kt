fun main(){
    val student: Student = Student()
    student.eat()
    student.sleep()
}
//인터페이스는 생성자가 없다 --> 인스턴스화 시킬 수 없다.

interface Person {
    //인터페이스를 구현하기 위해선 인터페이스 내부의 기능들을 반드시 구현해야한다.
    fun eat()
    //인터페이스에서 구현된 함수는 인터페이스를 구현하는 클래스에서 재정의할 필요가 없다.
    fun sleep(){
        println("sleep")
    }
    //abstract 키워드는 반드시 구현을 해줘야하는 함수임 나타낸다.
    abstract fun study()
}

class Student : Person{
    //Person의 eat, sleep 메소드를 반드시 구현해줘야한다.
    override fun eat() {
        TODO("Not yet implemented")
    }

    override fun study() {
        TODO("Not yet implemented")
    }
}

class SoccerPlayer: Person{
    override fun eat() {
        TODO("Not yet implemented")
    }

    override fun study() {
        TODO("Not yet implemented")
    }
}