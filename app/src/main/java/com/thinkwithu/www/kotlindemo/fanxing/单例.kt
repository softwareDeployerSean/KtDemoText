package com.thinkwithu.www.kotlindemo.fanxing

/**
 * Author: sean
 * Date: 2019/5/8 16:25
 */


fun main() {
//    danli.instance.name
//    danli.instance.age
//    println(text(C()))
    //获取函数的引用，用::函数名可以获取函数的引用
    /*  println(jisuan(4, 7, ::add))
      //lambda 表达式
      println(jisuan(77, 99, { m, n ->
          println()
          m - n
      }))
      //lambda表达式  去括号  括号前移
      println(jisuan(4, 9) { m, n ->
          m + n
      })*/
  /*  lamba(4)
    //使用lambda的时候，如果参数只有一个，那么可以省略参数不写，默认参数就是it
    jisuan(4, {
        it + 10
    })*/
    var list= listOf<String>("a","b","c")
   /* list.filter {  }*/

}

class danli() {
    var name = "asd"
    val age by lazy {
        5
    }
    //lateinit  不能修饰基本类型
    lateinit var height: String

    companion object {
        val instance by lazy {
            danli()
        }
    }

}


open class A
class B : A()
class C : A()
class D : A()

fun text(a: A): Boolean {
    return when (a) {
        is B -> true
        is D -> true
        else -> false
    }
}


fun add(a: Int, b: Int) = a + b
fun jian(a: Int, b: Int) = a - b

//高阶函数
fun jisuan(a: Int, b: Int, block: (Int, Int) -> Int): Int {
    return block.invoke(a, b)
}

//高阶函数
fun jisuan(a: Int, block: (Int) -> Int): Int {
    return block.invoke(a)
}

val lamba = { a: Int ->
    a
}








