package com.thinkwithu.www.kotlindemo

/**
 * Copyright (C), 2015-2019, 北京九州申友教育咨询有限公司
 * Author: sean
 * Date: 2019/4/25 17:23
 * Description: ${DESCRIPTION}
 */

fun main() {
    //编译器可以自动识别类型，所以不需要显示传入类型
//    var t1 = generic(8)
//    var t2 = generic<String>("44")
//    t1.dd(78)
//    println(t1.cc)
//    println(t2.cc)
//    printlnn("haha")
//    printlnn(995)
//    printlnn(true)
//    jjj(aaaa())

//    var color = getColor.Red
//    println(getColor.values())
//    println(getColor.valueOf("Blue"))
//    println(color.name)
//    println(color.ordinal)
    /* eatDrink(object : annimal("长颈鹿") {
         override fun eat() {
             super.eat()
             println("$this 在喝水")
         }
     })
     //通过对象表达式，我们可以直接拿到类的对象
     var aa = object : annimal("") {

     }
     var aa1 = object {

     }*/
    val pen1 = pen
    val pen2 = pen
    println(pen1 === pen2)


}

//泛型，即参数化类型，把类型参数化，就和实参一样，一开始我们不知道要传什么类型的参数，所以就用一个参数来代替这个类型，
//当我们准备传入参数的时候，在把类型带上去，是为了避免之后的代码出现问题，这样的话 我们需要string类型，就必须传string，传int就会报错，能从编译期解决类型转换报错的问题

class generic<T>(a: T) {
    val cc = a
    fun dd(r: T) {
        println(r)
    }
}


//泛型函数

fun <T> printlnn(value: T) {
    when (value) {
        is Int -> println("传过来的是整形数字$value")
        is String -> println("穿过来的是字符串${value.reversed()}")
        else -> println("啥也不是")
    }
}

//泛型约束

open class aaa
interface bbb


fun <T : aaa> haha(value: T) {

}

class aaaa : aaa(), bbb

//多个条件的泛型约束，使用where语句，并且只能有一个条件是类，其余都可以是接口
//where语句，多个条件同时满足，才能传这个类型，相当于&&
fun <T> jjj(value: T)
        where T : aaa,
              T : bbb {

}


//枚举类用enum修饰，当一个类的对象固定且有限时使用枚举类，可以达到类型安全的意义
enum class getColor {
    Red(), Blue(), White()
}

//对象表达式，对一个类作了轻微的改变，比如增加了某些功能，但却不需要新建子类，有点装饰器的味道，用object修饰
//就是java中的匿名内部类

open class annimal(var string: String) {
    open fun eat() {
        println("$string 在吃早饭")
    }
}

fun eatDrink(a: annimal) {
    a.eat()
}

//对象声明
//我们使用object来申明一个对象，相当于是拿到了类的实例，并且是单例的，
//相当于，我们可以很便捷的拿到一个对象，绕过了去申明类的过程
var c2c = object : annimal("a") {

}

fun text3() {
    c2c.eat()

}


object pen {
    fun write() {
        println("我在写字")
    }
}

//可以有父类，其实相当于是pencil 继承了父类，并且还得到了pencil类的对象，
//同时做了两个步骤，继承了父类，和实例化了对象
object pencil : annimal("劳资") {


}

class outer {
    var name = "wo"

    object inner {
        fun innerDo() {
//            println(name)  当声明对象在一个类的内部时，并不能访问到外部类的成员
        }

    }
}

var o = outer()
fun text1() {
//    println(o.inner) 外部类不能通过它的实例访问到这个对象
    outer.inner.innerDo()//只能通过类名直接访问
}


//伴生对象，从名字看，我们就可以看出来相当于这个对象是伴随着其他东西依托存在的
//用companion修饰，

class floor {
    companion object inner { //其实就是在类 内部的对象声明加了companion关键字，使得inner成了伴生对象
        fun innerDo() {

        }
    }
}

fun text4() {
    floor.innerDo() //伴生对象的成员可以被外部类直接访问，有点静态属性的味道，可以通过类名可以得到
}

class phone {
    companion object {  //我们可以省略掉伴生对象的名字，因为这个名字其实没多大意义
        fun dosomthing() {
            println("do")
        }
    }
}

fun text5() {
    val phone1 = phone.Companion  //我们可以通过类.companion拿到伴生对象，由此可以看出我们类的伴生对象只能有一个，即companion关键字只能用一次
    phone1.dosomthing()
}




























