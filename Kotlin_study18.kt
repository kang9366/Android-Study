fun main(){
    val s = "Hello!"
//문자열 연산
//문자열의 인덱스를 통해 각 문자에 접근 가능
    println(s[1])
    println(s[2])
//+연산자를 이용해 문자열을 연결 가능
    val s1 = "Hel"
    val s2 = "lo!"
    val s3 = s1+s2
    println(s3)
//==와 !=를 이용해 동등성 비교 가능
    println(s==s3)

//문자열 관련 함수
//문자가 비어있는지 검사
    println("Hello".isEmpty())
    println("".isEmpty())

    //부분 문자열 추출
    println("Hello".substring(2))
    //범위를 지정해서 추출
    println("Hello".substring(1,3))

    //접두사나 접미사인지 검사
    println("Hello".startsWith("Hel"))
    println("Hello".endsWith("lo"))

    //parameter로 받은 문자나 문자열이 문자열에 나타나는 첫번째 인덱스 반환
    println("abcabc".indexOf('b')) //1반환
    println("abcabc".indexOf("ca")) //2반환
    println("abcabc".indexOf("ad")) //해당하는 문자나 문자열이 없는 경우 -1반환
}