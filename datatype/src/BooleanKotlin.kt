fun main(){
    val a:Boolean = false
    val b:Boolean = true
    var result :Boolean

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


    /*
     操作运算符
        ' || ' => 逻辑或（或者）
        ' && ' => 逻辑与（并且）
        ' ! ' => 逻辑非（取反）
     */
    if (a || b) {
        result = a || b
        println("a || b => $result")
    }

    if (a && b) {
        result = a && b
        println("a&&b => $result")
    }

    result = !a
    println("not a => $result")

    result = !b
    println("not b => $result")

}
