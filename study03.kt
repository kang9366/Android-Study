//String template

fun main(){
    val name = "Kang"
    println("My name is $name")
    //string template 다음 한 칸은 반드시 띄워쓰기를 해야한다.
    println("My name is $name I'm 25.")
    //띄어쓰기를 하고 싶지 않다면 {}사용
    println("My name is ${name}I'm 25.")

    //escape sequence
    println("This is 2\$")
}