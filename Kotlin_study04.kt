fun main(){
    val a = 10
    val b = 20

    if(a > b){
        println($a is bigger than $b)
    }else{
        println($b is bigger than $a)
    }

    //if문을 간결하게 표현하는 방법
    if(a>b) println($a is bigger than $b) else println($b is bigger than $a)
}

//return 키워드는 생략되었음
fun ifElse(a:Int, b:Int) = if(a>b) a else b

//when
fun checkNum(score:Int){
    //else는 사용하지 않아도 무방하다.
    when(score){
        0 -> println("this is 0")
        1 -> println("this is 1")
        else -> println("I don't know")
    }

    //return값이 있어야 하는 경우에는 else 반드시 사용
    var b = when(score){
        1 -> 1
        2 -> 2
        else -> 3
    }

    //a와 b사이의 값은 a..b로 표현 가능
    when(scoer){
        in 90..100 -> println("You are good")
        in 10..80 --> println("You are bad")
        else --> print("okay")
    }
}

//Expression vs Statement
//Expression : return값을 만들어내는 것
//Statement : return값을 만들어내지 않는 것
//코틀린에서는 조건문을 expression으로 사용할 수 있다. (자바에서는 불가능)
