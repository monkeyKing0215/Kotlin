fun main(){
   // dataTypeConversion()
    stringOperation()
}

/**
 * 基础数据类型转换
 *  -------------------------
 * 在java中类型转换便捷方法：
 *     int a = 10;
 *     long b =a ;
 *     system.out,println(b)
 *  -------------------------
 *  接下来看看kotlin中是否支持隐式转换，那么Number类作为所有
 *  数值类的父类，其中提供toXXX:XXX的作用又是什么呢
 */
fun dataTypeConversion(){
    val a:Int = 129;
    val b:Long
 //   b =a
  //  println("after conversion: $b") //=>Kotlin: Type mismatch: inferred type is Int but Long was expected

    /*
        在Kotlin中，并不支持隐式转换，编译器会在编译的时候报错
        正确姿势: ==>参考api文档中toXXX():XXX || 点击Number
        notice：源码注释明确指出在转化类型时会涉及舍入，截断等情况；
                根据实际情况选择更好的方式吧
     */
    b = a.toLong()
    println("explicit conversion: $b")

}
/**
 *  kotlin之中String类方法
 *  notice:kotlin中的string类并没有一些功能函数去调用。
 *         最简单的方式去查看StringsJVM.kt文件，底层还是调用java的方法
 *         path：kotlin-stdlib.jar -> kotlin -> text -> stringsJVM.kt
 *
 *
 */
fun stringOperation(){
    val str: String = "i am a handsome boy"
    var string: String


    /*
        description:Returns a string obtained by concatenating this string
                    with the string representation of the given other object.
                    => 返回一个拼接字符串，可以为任何类型（包括为空）
         plus(Any?)：String
     */
    string = str.plus(10)
    string = str.plus("10")
    string = str.plus(10L)
    string = str.plus(10f)
    string = str.plus(null)
    //...so on
    println("plus: $string")

    /*
        description:顾名思义，返回该字符串长度：Int
     */
    val length = str.length
    println("str length:$length")
    /**
     *字符串查找：
     */

    /*
      description:
        获取第一个元素:first(),first{},firstOrNull(),firstOrNull{};
     */
    println("获取第一个元素：${str.first()}") //==>str[0],str.get(0)
    val firstIndex:Int = 0
    println("获取第一个元素：${str[firstIndex]}")
    println("获取第一个元素：${str.get(firstIndex)}")
    println("获取第一个元素：${str.first { it=='a' }}")//有查找的意思，等于某一个字符的第一个元素？？搞不懂有啥意义
    println("获取第一个元素：${str.firstOrNull()}")
    println("获取第一个元素：${str.firstOrNull { it=='a' }}")

    /*
        description：
          获取最后一个元素：last(),last{},lastOrNull(),lastOrNull{};
     */
    println("获取最后一个元素：${str.last()}")
    val lastIndex: Int = str.length - 1;
    println("获取最后一个元素：${str.get(lastIndex)}")
    println("获取最后一个元素：${str[lastIndex]}")
    println("获取最后一个元素：${str.last { it == 'a' }}")//和first{}一个意思，没明白意思
    println("获取最后一个元素：${str.lastOrNull()}")
    println("获取最后一个元素：${str.lastOrNull { it == 'a' }}")

    /*
        description：
            获取指定元素下标：find{},findLast{},indexOf(),indexLastOf(),indexOfFirst(),indexOfFirst{}
     */
    println("获取元素第一次出现下标：${str.indexOf("0",0)}")

    /**
        字符串替换
     */

    /*
      description:kotlin提供了四个重载函数：
                    1.replace(oldChar,newChar,ignoreCase = false) -->oldChar:需要替换的字符；oldChar：新字符；ignoreCase：是否引用java的replace（）
                    2.replace(oldValue,newValue,ignoreCase = false)-->oldValue:需要替换的字符；oldValue：新字符；ignoreCase：是否引用java的replace（）
                    3.replace(regex,replacement)-->regex:正则表达式；replacement:新的字符串
                    4.replace(regex: Regex, noinline transform: (MatchResult) -> CharSequence)-->regex:正则表达式；transform:高阶函数;   (不会用，以后学到高阶函数再说！)
     */

    println("字符串替换： ${str.replace("1", "猪")}")
    println("字符串替换： ${str.replace(str, "我是只猪")}")
    println("字符串替换： ${str.replace(Regex("[0-9]"), "我是只猪;")}")


}