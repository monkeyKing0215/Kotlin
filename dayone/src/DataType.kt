
fun main(){
    //datatype()
    bitsOperation()
}

/**
 *
 * kotlin 中变量的关键字 var val区别
 * 依据：kotlin的类型推导机制
 * var <标识符> : <类型> = <初始化值> --->变量
 * val <标识符> : <类型> = <初始值> --->常量
 */
fun defineData(){

    var variable1 = 10;
    var variable2:Int = 10;
    var variable3:Int
    variable3 = 10;

    variable1 *= 10
    println(variable1)

    val value = "100" //可读，不可变变量。等价于java中final修饰的变量
    println(value)
}

/**
 * kotlin中的数据类型和java的区别
 * kotlin中数据类型的一些常用api
 * int -> Int(32 bits) byte -> Byte(8) short -> Short(16) double -> Double(64) float -> Float(32) long -> Long(64)
 *
 */
fun datatype(){

    var result = 0;
    val a:Int = 10;
    val b:Int = 2;
    /*
   description:Compares this value with the specified value for order.
        Returns zero if this value is equal to the specified other value,
        a negative number if it's less than other,
        or a positive number if it's greater than other.两者比较，大于返回1，小于返回-1，等于返回0
     */
    result = a.compareTo(b)
    println("a compareTo b : $result")

    /*
       a.dec  a自减 等价于 a--
       a.inc  a自增 等价于 a++
     */
    a.dec()
    a.inc()
    result=a
    println("a dec: $result ")

    /*
        description :Divides this value by the other value.
        等价 a/b
     */

    result = a.div(b)
    println("a div b: $result")





}

/**
 * 数据位运算
 */
fun bitsOperation(){
    var result = 0
    val a:Int = -10
    val b:Int = 2

    /*
        “与”运算->全真为真，全假为假，一假为假
          1 and 1 = 1
          0 and 0 = 0
          0 and 1 = 0

    analysis： a=1010  b=0010 result->0010
   */
    result = a.and(b)
    println("a and b: $result")

    /*
       description : Inverts the bits in this value. 按位取反
       计算机中数用补码存储 例如（1个字节位表示）：10=0000 1010（原码=反码=补码）；

       analysis：
           a =0000 1010; inverts:1111 0101->原码；补码:1000 1011 = -11;
           a =1000 1010; 补码：1111 0110  inverts:0000 1001->9
    */
    result = a.inv()
    println("a invert :$result")

    /*
        ”或“运算->全真为真，全假为假，一真即真
            1 or 0  1
            1 or 1  1
            0 or 0  0

       analysis： a=1010 b=0010  result->1010
     */
    result = a.or(b)
    println("a or b: $result")
    /*
        “异或”运算-> 全假为假，全真也为假，一真即真
        　　0 ^ 0  0
        　　0 ^ 1  1
        　　1 ^ 1  0
        analysis: a=1010 b=0010 result->1000
     */
    result = a.xor(b)
    println("a xor b: $result")
    /*
        description:Shifts this value left by the bitCount number of bits.
                    Note that only the five lowest-order bits of the bitCount
                    are used as the shift distance.
                    The shift distance actually used is therefore always in the range 0..31.

                    a.shl(b)-> a向左移b位 范围：0-31
         analysis：依旧一个字节位 a=0000 1010; a<<2 -> 0010 1000(40)
                               a=1000 1010; 补码：1111 0110； a<<2 -> 1101 1000；
     */
    result = a.shl(b)
    println("a shl b:$result")
    result = a.shr(b)
    println("a shr b:$result")
    result = a.ushr(b)
    println("a ushr b:$result")
}

