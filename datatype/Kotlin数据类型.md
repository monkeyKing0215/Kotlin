# Kotlin数据类型

## 1.Number数据类型

| 基本类型 |                             备注                             |
| :------: | :----------------------------------------------------------: |
|   Byte   |                      8bites（-128-127）                      |
|  Short   |                    16bits(-321768-32767)                     |
|   Int    |                  32bits（-2^32^ - 2^32^-1）                  |
|  Float   |              32bits( 1.4E-45F -- 3.4028235E38F)              |
|  Double  |        64bites（4.9E-324 -- 1.7976931348623157E308）         |
|   Long   | 64bits（-9223372036854775807L - 1L -- 9223372036854775807L） |

### Byte类型以及相关API

|              name              |                           meaning                            |
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
|           ToXXX:XXX            |                    类型转换；return xxx;                     |

### Short类型以及相关API

|              name               |                           meaning                            |
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
|            ToXXX:XXX            |                    类型转换；return xxx;                     |

### Int类型以及相关API

|           name           |    meaning    |
| :----------------------: | :-----------: |
| shl(bitCount: Int): Int  | 有符号左移<<  |
| shr(bitCount: Int): Int  | 有符号右移>>  |
| ushr(bitCount: Int): Int | 无符号右移>>> |
|   and(other: Int): Int   |    与运算     |
|   or(other: Int): Int    |    或运算     |
|   xor(other: Int): Int   |   异或运算    |
|        inv(): Int        |   按位取反    |

### Float类型以及相关API

### Double类型以及相关API

Int之后的表格均为扩展api，未写出可直接参考最开始的模板！