fun main(){
    //Immutable collection
    //list는 동일값 중복 허용 o
    val numberList = listOf<Int>(1,2,3,3,3)
    println(numberList)
    println(numberList.get(0))
    println(numberList[0])

    //set은 동일값 중복 허용 x
    val numberSet = setOf<Int>(1,2,3,3,3)
    println(numberSet)
    //set은 get메소드 사용 불가 --> 순서가 존재하지 않는다.
    numberSet.forEach {
        println(it)
    }

    //map -> key, value 방식으로 데이터를 관리
    val numberMap = mapOf<String, Int>("one" to 1, "two" to 2) //key, value의 순서로 작성
    println(numberMap.get("one")) //map의 요소에 접근할 때에는 key값으로 접근한다.

    //Mutable collection
    val mnumberList = mutableListOf<Int>(1, 2, 3)
    mnumberList.add(3, 4) //3번 index에 4값 추가
    println(mnumberList)

    val mNumberSet = mutableSetOf<Int>(1,2,3,3)
    mNumberSet.add(10)
    println(mNumberSet)

    val mNumberMap = mutableMapOf<String, Int>("one" to 1)
    mNumberMap.put("two", 2) //map에 요소를 추가할때에는 put사용
    println(mNumberMap)
}
