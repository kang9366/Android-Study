fun main(){
    val students = arrayListOf("kang", "jenny", "jennifer")
    for(name in students){
        println("$name")
    }
    var sum : Int = 0
    for (i in 1..10){
        sum += i
    }
    println(sum)

    //2칸씩 건너뛰면서 반복 ex) 1, 3, 5, 7 ...
    for (i in 1..10 step 2){
        sum += i
    }
    println(sum)

    //10부터 1까지
    for (i in 10 downTo 1){
        sum += i
    }

    //100은 포함 x
    for (i in 1 until 100){
        sum += i
    }

    var index = 0
    while(index < 10){
        println("current index is $index")
        index++
    }

    for ((index:Int, name:String) in students.withIndex()){
        println("${index+1}번째 학생 : ${index}")
    }
}