fun main(){
    val a:Boolean = true
    val b:Boolean = false
    var result = false

    /*
        关于’或，异或，与‘运算分析参考NumberKotlin中的fun bitsOperation()
     */
    result = a.and(b)
    println("a and b :$result")

    result=a.not()
    println("a not：$result")

    result=a.or(b)
    println("a or b:$result")

    result =a.xor(b)
    println("a xor b:$result")

    val int =a.compareTo(b)
    println("a compare:$int")
}
