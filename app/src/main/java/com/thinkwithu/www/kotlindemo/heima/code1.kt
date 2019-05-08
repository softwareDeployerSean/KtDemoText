package com.thinkwithu.www.kotlindemo.heima

import java.lang.Exception
import java.math.BigInteger

/**
 * Copyright (C), 2015-2019, 北京九州申友教育咨询有限公司
 * Author: sean
 * Date: 2019/5/5 10:54
 * Description: ${DESCRIPTION}
 */

//程序的主方法
fun main(argus: Array<String>) {
//    println(sayHello("xiaozhang"))
//    println(checkAge(19))
//    saveLog(1)
//    println(darary("滁洲岛"))
//    qujian()
//    add(3, 2)
//    hanshu()
//    zhouchang(a = 6.3f)
//    jiaohu()
    println(jiecheng(BigInteger("100000")))
}

fun basic1() {
    var a = 5  //智能推断类型  var  可变的数据
    var b: Byte = 9 //显示指定类型
    var c: Int //指定类型，可以被重新赋值
    c = 99
    val number = "No.123598" //val 是常量，不能被修改，只读数据，确定了就不能被修改
//    number = "sdfdf"

    var d: Boolean
    d = 5 > 4

}


fun sayHello(name: String): String {
    return name
}

fun checkAge(age: Int): Boolean {
    return age > 18
}

fun saveLog(logLeavel: Int) {
    println(logLeavel)
}


//字符串模板    用$符号
fun darary(place: String): String {
    var comtent = """
        今天我去了${place}这里游玩，真好玩
    """.trimIndent()
    return comtent
}


fun qujian() {
    var a = 1..100000
    var result: Int = 0
    for (c in a) {
        result = result + c
    }
    println(result)
}

fun add(a: Int, b: Int) = a + b

fun hanshu() {
    var a = { x: Int, y: Int -> x + y }
    var b: (Int, Int) -> Int = { x, y -> x + y }
    var resule = a(3, 6)
    println(resule)
}


fun zhouchang(pi: Float = 3.14f, a: Float): Float = a * pi


fun jiaohu() {
    while (true) {
        try {
            println("********************************")
            println("请输入第一个数字")
            var a = readLine()!!.toInt()
            println("请输入第二个数字")
            var b = readLine()!!.toInt()
            println("$a + $b =${a + b}")
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }
}



// tailrec  尾递归 优化   不管多少次都要执行
tailrec fun  jiecheng(a: BigInteger): BigInteger {
    println(100000 - a.toInt())
    if (a == BigInteger.ONE) {
        return BigInteger.ONE
    } else {
        return jiecheng(a - BigInteger.ONE)
    }
}





















