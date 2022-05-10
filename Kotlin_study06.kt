fun main(){
    val array = arrayOf(1,2,3)
    val list = listOf(1,2,3)

    print(list[1])

    //array와 list에는 다양한 데이터 타입이 존재 가능하다.
    val array2 = arrayOf(1, "d", 3.4f)
    val list2 = listOf(1, "d", 3.4f)

    //array is mutable
    //list는 일반 list와 mutable list 두종류가 있다.
    array[0] = 3
    var result = list.get(0)
    var arrayList = arrayListOf<Int>()
    arrayList.add(10)
    arrayList.add(20)
}
