fun main(){
    operation()
}

fun operation(){
    val a:Char = 'b'
    val b:Char = 'c'

    var result:Int = a.compareTo(b)
    println("compare: $result")

    var char:Char = a.plus(result)
    println("plus:$char")

    result = a.minus(char)
    println("minus:$result")

    char = b.inc()
    println("inc：$char")

    char = b.dec()
    println("dec: $char")

    val range:CharRange = a.rangeTo(b)
    println("range: $range")

    val toInt:Int = a.toInt()
    println("toInt :$toInt")

}