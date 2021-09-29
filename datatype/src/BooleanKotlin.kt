fun main(){
    //logicOperation()
   differenceOfAnd()
}

fun logicOperation(){
    val a:Boolean = false
    val b:Boolean = false
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
        !!是否进行了短路操作
     */
    if (a || b) {
        result = a || b
        println("a || b => $result")
    }

//    if (a && b) {
//        result = a && b
//        println("a&&b => $result")
//    }


    result=a&&b;
    println("a&&b =>$result")
    result = !a
    println("not a => $result")

    result = !b
    println("not b => $result")
}

/**
 * 探究按位与（&）和逻辑与（&&）的关系
 * 口诀大法：全真即真，全假为假，一假即假
 */
fun differenceOfAnd(){
    val a = true
    var b=2
    var c=2
    val d = false
    var e=2
    var f=2

    if (a.and(b++>0)){
        println("beautiful girl")
    }else{
        println("handsome boy")
    }
    if (a &&(c++>0)){
        println("beautiful girl")
    }else{
        println("handsome boy")
    }

    println("b: $b")
    println("c: $c")
    /*
     a=true,b=c=2;
     输出:漂亮妹妹，漂亮妹妹;b=c=3
     analysis：
        b=3,漂亮妹妹==>condition=true，condition执行完毕?;
        c=3,漂亮妹妹==>condition=true,condition执行完毕?；
     */

    if (d.and(e++>0)){
        println("beautiful girl")
    }else{
        println("handsome boy")
    }
    if (d &&(f++>0)){
        println("beautiful girl")
    }else{
        println("handsome boy")
    }

    println("e: $e")
    println("f: $f")
    /*
     d=true,e=f=2;
     输出：帅气哥哥，帅气哥哥;e=3,f=2
     analysis:
        e=3,帅气哥哥==>condition=false,condition全部执行完毕；
        f=2,帅气哥哥==>condition=false,condition并未执行完毕;
     */

    /**
     * 综述：当执行逻辑与（&&）时，遇到false，会立即中断执行 ==> 短路操作
     *      当执行按位与（&）时，程序依旧会跑完
     *
     *     同理：1.&& &
     *          2.|| |
     */
}