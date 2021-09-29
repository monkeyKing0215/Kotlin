# Kotlin数据类型

## 1.Number数据类型

Kotlin中Number类是所有数值类型的父类。

以下的几个数据类型都可以看到: 

``` Kotlin 
public class <primitive type> private constructor() : Number()
```

| 基本类型 |                             备注                             |
| :------: | :----------------------------------------------------------: |
|   Byte   |                      8bites（-128-127）                      |
|  Short   |                    16bits(-321768-32767)                     |
|   Int    |                  32bits（-2^32^ - 2^32^-1）                  |
|  Float   |              32bits( 1.4E-45F -- 3.4028235E38F)              |
|  Double  |        64bites（4.9E-324 -- 1.7976931348623157E308）         |
|   Long   | 64bits（-9223372036854775807L - 1L -- 9223372036854775807L） |

### Byte类型以及相关API

| api(return <primimitve type>)  |                meaning(val a:Byte,val b:Byte)                |
| :----------------------------: | :----------------------------------------------------------: |
|  compareTo(other: Byte): Int   | 比较；if (a == b) return 0;if(a < b) return -1; if(a > b) return 1; |
|     plus(other: Byte): Int     |                      加法；return a+b;                       |
|    minus(other: Byte): Int     |                      减法；return a-b;                       |
|    times(other: Byte): Int     |                      乘法；return a*b;                       |
|     div(other: Byte): Int      |                      除法;  return a/b;                      |
|     rem(other: Byte): Int      |                     求余数；return a%b;                      |
|          inc(): Byte           |                      自增;  return a+1;                      |
|          dec(): Byte           |                      自减；return a-1；                      |
|        unaryPlus(): Int        |                     返回本身；return a；                     |
|       unaryMinus(): Int        |                    返回相反数；return -a;                    |
| rangeTo(other: Byte): IntRange |                 返回一个区间；return [a,b];                  |
|           toXXX:XXX            |                  显示类型转换；return xxx;                   |

### Short类型以及相关API

|  api(return <primimitve type>)  |               meaning(val a:Short,val b:Short)               |
| :-----------------------------: | :----------------------------------------------------------: |
|  compareTo(other: Short): Int   | 比较；if (a == b) return 0;if(a < b) return -1; if(a > b) return 1; |
|     plus(other: Short): Int     |                      加法；return a+b;                       |
|    minus(other: Short): Int     |                      减法；return a-b;                       |
|    times(other: Short): Int     |                      乘法；return a*b;                       |
|     div(other: Short): Int      |                      除法;  return a/b;                      |
|     rem(other: Short): Int      |                     求余数；return a%b;                      |
|          inc(): Short           |                      自增;  return a+1;                      |
|          dec(): Short           |                      自减；return a-1；                      |
|        unaryPlus(): Int         |                     返回本身；return a；                     |
|        unaryMinus(): Int        |                    返回相反数；return -a;                    |
| rangeTo(other: Short): IntRange |                 返回一个区间；return [a,b];                  |
|            toXXX:XXX            |                  显示类型转换；return xxx;                   |

### Int类型以及相关API

| api(return <primimitve type>) |    meaning    |
| :---------------------------: | :-----------: |
|    shl(bitCount: Int): Int    | 有符号左移<<  |
|    shr(bitCount: Int): Int    | 有符号右移>>  |
|   ushr(bitCount: Int): Int    | 无符号右移>>> |
|     and(other: Int): Int      |  位与运算and  |
|      or(other: Int): Int      |  位或运算or   |
|     xor(other: Int): Int      |  异或运算xor  |
|          inv(): Int           |  按位取反inv  |

### Float类型以及相关API

### Double类型以及相关API



Int之后的表格均为扩展api，未写出可直接参考最开始的模板！

## 2.Boolean类型

| api(return <primimitve type>)  |           meaning            |
| :----------------------------: | :--------------------------: |
|         not(): Boolean         | 返回相反布尔值；!true =false |
|  and(other: Boolean): Boolean  |  按位与（不执行短路）''&''   |
|  or(other: Boolean): Boolean   |  按位或（不执行短路）''\|''  |
|  xor(other: Boolean): Boolean  |           异或运算           |
| compareTo(other: Boolean): Int |             比较             |

Java中的短路操作是指：

A&&B，A = false；不会去计算B的值，直接返回false；只有当A=true时，才会计算B值

## 3.Char类型

|  api(return <primimitve type>)  | meaning(val a:Char) |
| :-----------------------------: | :-----------------: |
|   compareTo(other: Char): Int   | 和一个char字符比较  |
|     plus(other: Int): Char      |     a + b:Int;      |
|     minus(other: Char): Int     |     a - b:Char;     |
|     minus(other: Int): Char     |      a-b:Int;       |
|           inc(): Char           |        a+'1'        |
|           dec(): Char           |        a-'1'        |
| rangeTo(other: Char): CharRange |     [a,b]=>a..b     |
|            toXXX:XXX            |    显示类型转换     |

Char类型有几个需要注意的地方：

- 不能直接和数字做类型转换，可以采用他们的unicode码的相对差做转换
- 字符的表示：'a'
- 特殊字符的话是用反斜杠开头的，\t,\s;
- 字符可以使用unicode编码。‘\uFF00'

![](https://github.com/monkeyKing0215/Kotlin/blob/master/Kotlin转义字符.png)

