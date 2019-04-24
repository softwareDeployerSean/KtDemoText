package com.thinkwithu.www.kotlindemo

/**
 * Copyright (C), 2015-2019, 北京九州申友教育咨询有限公司
 * Author: sean
 * Date: 2019/4/23 12:02
 * Description: ${DESCRIPTION}
 */

// main方法是kt的进入方法，好比java的main方法
fun main() {
//    conditionif(5, 9);
//    conditionwhen("李四", 5)
//    conditionfor()
    conditionwhile()
}

fun conditionif(a: Int, b: Int) {
    //传统用法
    var max: Int = b
    if (a > b) max = a
    //用if  else
    if (a > b) {
        max = a
    } else {
        max = b
    }
    //if作为表达式，可以进行赋值，取代java的三目运算符
    max = if (a > b) {
        a
    } else {
        b
    }
    max = if (a > b) a else b
    println("max的值是$max")

    if (a in 5..9) {
        println("$a 在区间")
    }
}

//when 相当于增强版的java switch case语句 支持任意类型，不用写break
fun conditionwhen(a: String, b: Int) {
    when (a) {
        "张三" -> println("我是张三")
        "李四" -> println("我是李四")
        else -> println("我是王五")
    }

    when (b) {
        4, 5 -> println("b的值是4或者5")//条件可以写在一起，
        in 1..10 -> println("在区间1到10之间")//支持in  ,!in写法
        !in 50..100 -> println("不在50到100之间")
        is Int -> println("是整型")//支持is  !is写法
    }

    when {
        b == 1 -> println("b的值是1") //不传参，取代if  else 的写法，不传参数
        b == 2 -> println("b的值是2")
        else -> println("b的值不知道是多少")
    }

    var d = when (b) { //when语句作为表达式，可以进行赋值
        1 -> 11
        2 -> 22
        else -> 8
    }
    println(d)
}

fun conditionfor() {
    var a = arrayOf(4, 5, 6)
    for (b in a) {
        println(b)
    }
    for (c in a.withIndex()) {
        println(c)
    }
    for (d in a) {
        if (d == 4) continue //结束本次循环，继续下一次
        if (d == 5) break //跳出循环
    }

    oop@ for (e in a) {  //以名字加上@符号 给表达式取名
        for (j in a) {
            break@oop //跳出最外层循环
        }
    }


}

fun conditionwhile() {
    var a = 0
    while (a > 0) { //满足条件 就会继续执行
        println(--a)
    }
    println("--------------")
    do {
        println(--a)  //先执行一次，在进去while判断
    } while (a > 0)


}









