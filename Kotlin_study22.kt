fun main(){
    val book1 = Book("Kotlin", 10000).apply {
        //기존에는 인스턴스 함수를 사용해 속성을 변경해주었다.
        //book.name = "Kotlin 1"
        //book.discount()

        //apply 함수에서는 참조연산자를 통해 프로퍼티에 접근하지 않고 인스턴스 생성과 동시에 바로 초기화 가능
        name = "Kotlin 1"
        discount()
    }
    println(book1.name)
    println(book1.price)

    //run은 apply와 동일하지만 마지막 구문을 반환값으로 사용한다.
    val book2 = book1.run {
        price
    }
    println(book2)

    //with는 run과 형식만 약간 다를뿐 동일한 결과를 반환한다.
    val book3 = with(book1){
        price
    }
    println(book3)
}

class Book(var name: String, var price: Int){
    fun discount(){
        price -= 2000
    }
}