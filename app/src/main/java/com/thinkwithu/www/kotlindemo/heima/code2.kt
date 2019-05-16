package com.thinkwithu.www.kotlindemo.heima26

/**
 * Author: sean
 * Date: 2019/5/5 17:36
 */

fun main(args: Array<String>) {
//    han_shu_shi()
    //::函数名，用于声明函数对象
    var add = ::add
    //有两种方式，函数对象的调用，
    println(add(1, 2))
    //这种方式更加安全
    println(add?.invoke(1, 2))


}

fun han_shu_shi() {
    var stringlist = listOf<String>("a", "b", "c")
    //d第一种写法
    /* for (i in stringlist) {
         println(i)
     }
     //第二种写法
     var print = fun(name: String) {
         println(name)
     }
     stringlist.forEach(
         print
     )
     //第三种写法,把参数抽了出来 it就是参数，我们可以直接写函数体
     stringlist.forEach {
         println(it)
     }*/
    println(stringlist.findLast {
        it.equals("a") && it.equals("1")
    })
}

fun add(a: Int,b:Int): Int {
    return a
}

//可变参数 vararg
fun add1(vararg a: Int): Int {
    var result = 0
    a.forEach {
        result += it
    }
    return result
}



