fun main(){
//  비트연산은 주로 플래그 값을 저장하거나 네트워크에서 프로토콜의 데이터 양을 줄이기 위해 사용한다.

//  bitwise shift operators
//  - shl : 부호비트를 제외한 모든 비트를 좌측으로 이동
//  - shr : 부호비트를 제외한 모든 비트를 우측으로 이동
//  - ushl : 부호비트를 포함한 모든 비트를 좌측으로 이동
//  - ushr : 부호비트를 포함한 모든 비트를 우측으로 이동

//  bitwise operators
//  - and : 원본과 비교대상의 값을 비트단위로 비교하여 둘다 1인경우 1반환
//  - or : 원본과 비교대상의 값을 비트단위로 비교하여 둘 중 하나라도 1인경우 1반환
//  - xor : 원본과 비교대상의 값을 비트단위로 비교하여 비트가 같은 자리는 0, 다른 자리는 1반환

    var bitData: Int = 0b1000
    bitData = bitData or(1 shl 2)
    println(bitData.toString())

    var result = bitData and(1 shl 4)
    println(result.toString())
    println(result shr 4)

    bitData = bitData and((1 shl 4).inv())
    println(bitData.toString(2))

    println((bitData xor(0b10100)).toString(2))
}