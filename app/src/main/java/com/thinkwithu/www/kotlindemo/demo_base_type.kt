package com.thinkwithu.www.kotlindemo

import java.lang.Exception
import java.lang.IndexOutOfBoundsException
import java.lang.NumberFormatException

/**
 * Copyright (C), 2015-2019, 北京九州申友教育咨询有限公司
 * Author: sean
 * Date: 2019/4/18 16:14
 * Description: ${DESCRIPTION}
 */
fun main() {
//    basictype()
    var argus = arrayOf(5, 10)
//    bianli(argus)
//    abnormal(argus);
//    expression(argus)
//    parameter(4, 4, a = "1")
//    change("a", "b", "v")
//    string()
//    nullText()
//    range()
//    compare()
//    char('5')
//    array(intArrayOf(5, 8))
    string("hello")
}


/**
 * 基本数据类型
 */
fun basictype() {
    //数字：Double,Float,Long,Int,Short,Byte
    var INta = 1 //可以不用指定类型，使用时会自动判断类型
    var LongA = 5L//长整型，用L标记
    var OXA = 0Xff//十六进制，以0x开头标记
    var ObA = 0b1011//二进制，以0b开头
    //不支持8进制
    var DoubleA = 6.55//默认是double类型
    var FloatA = 6.5f//单精度以f结尾
    var oneMillion = 1_000_000//以下划线分割，易读
}

/**
 *  for 循环
 */
fun bianli(argus: ArrayList<String>) {
    for (value in argus) {
        println(value)
    }
    for ((index, value) in argus.withIndex()) {
        println("$index->$value")
    }
    for (indexvalue in argus.withIndex()) {
        println(indexvalue)
    }

}

/**
 * 异常处理
 */

fun abnormal(argus: Array<String>) {
    try {
        var a = argus[0]
        var b = argus[1]
        var c = a.toInt() + b.toInt()
        print(c)
    } catch (e: NumberFormatException) {
        println("您给的是整数吗")
    } catch (e: IndexOutOfBoundsException) {
        println("您给的是两个整数吗")
    } finally {
        println("谢谢使用")
    }

}

/**
 * 表达式
 */
fun expression(argus: Array<Int>) {
    var a = try {
        argus[0].toInt() / argus[1].toInt()
    } catch (e: Exception) {
        e.printStackTrace()
    } finally {
        println("我是表达式")
    }
    println(a)
}

/**
 *vararg修饰变长参数
 * 具名参数
 * 默认参数
 */
fun parameter(vararg ints: Int, a: String, c: Double = 5.2) {
    for (b in ints) println(b)
    println(a)
    println(c)
}

//函数以fun关键字修饰，参数是以变量：类型形式，返回值是以;类型写在最后 ，；可以省略
fun func(a: Int, b: String): Int {
    return 1
}

//表达式作为函数体，返回类型自动判断
fun sun(a: Int, b: Int) = a + b

public fun sum(a: Int, b: Int) = a + b

//无返回值，unit可以省略
fun printsum(a: Int, b: Int): Unit {
    println(a + b)
}

fun printsum1(a: Int, b: Int) {
    println(a + b)
}

//可变长参数用vararg显示
fun change(vararg v: String) {
    for (i in v)
        println(v)
    println("b")
    println("vvv")
}

//var 修饰可变变量，
var cc: String = "7"

fun text() {
//编译器自动识别类型
    var aa = 4
    aa += 1
}

//字符串模板 以$符号
fun string() {
    var a = "a"
    var b = "this is $a"
    var c = "this is ${text()}"
    println(b)
    println(c)
}


//null 安全机制
fun nullText() {
    var a: String? = null// ?表示可为空
//    var b = a!!.toInt()//！！表示如果为null则抛出异常
    var c = a?.toInt()//?表示如果为null则返回null
    var d = a?.toInt() ?: -1//?:表示 如果为null则返回-1
    println(a)
//    println(b)
    println(c)
    println(d)
}


fun typeText(obj: Any): Int? {
    if (obj is String) {
        return obj.length  //obj自动转换成String
    }
    return null
}


fun typeText1(obj: Any): Int? {
    if (obj !is String) {
        return null
    }
    return obj.length //obj自动转换String
}

fun typeText2(obj: Any): Int? {
    if (obj is String && obj.length > 0) {//obj自动转换String
        return obj.length
    }
    return null
}

//区间
fun range() {
    for (i in 1..5) println(i)
    for (i in 1..10 step 2) println(i)
    for (i in 4 downTo 1 step 1) println(i)
    for (i in 2 until 7) println(i)
}


//kt没有基础数据类型，只有封装的数字类型
//两个=表示，比较值的大小，三个=表示比较地址
fun compare() {
    val a = 100
    val b: Int? = a
    val c: Int? = a
    println(c == b)
    println(c === b)
}

fun type() {
    var a: Int = 5
    var b: Long = a.toLong()
    var c: String = a.toString()
}

//字符：不能和数字类型直接操作,可以显示转换成数字类型
fun char(c: Char): Int? {
    if (c in '0'..'9') {
        return c.toInt()
    }
    return null
}

//数组，用Array实现，此外还有IntArray,DoubleArray,等等
fun array(ary: IntArray) {
    println(ary.size)
    println(ary[0])
    ary[0] = 100
    println(ary[0])
}

//字符串可以被遍历，用三个"""可以支持换行操作，用trimmargin去掉字符串前面多余的空格，默认是以竖线分割
fun string(a: String) {
    for (s in a) {
        println(s)
    }
    var s1 = """
多行字符串
        支持
多行字符串用三个双引号
    """
    var s2 = """
        5多行字符串
        5支持
        5多行字符串用三个双引号
    """.trimMargin("5")
    println(s1)
    println(s2)
}















































































