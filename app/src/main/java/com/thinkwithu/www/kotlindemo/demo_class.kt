package com.thinkwithu.www.kotlindemo

/**
 * Copyright (C), 2015-2019, 北京九州申友教育咨询有限公司
 * Author: sean
 * Date: 2019/4/23 17:13
 * Description: ${DESCRIPTION}
 */
fun main() {

    /* var f = FourClass(88)
     f.cc()
     var fi = Five("", 1, "")*/
    /* var a = eight.nine(10).foo()
     println(a)*/
    var c = C()
    c.foo()

}

//类用class修饰，
class FirstClass {
    public var change: Int = 5 //var申明可变变量
    val a: String = "4" //val申明常量，相当于final


    //成员函数
    fun foo() {
        println("foo")
    }


}

class SecondClass constructor(a: String) {
    //类的主构造器，用constructor修饰，如果没有用可见修饰符修饰，那么constructor可以省略
    var firstClass = FirstClass()//我们可以像使用普通方法那样对类进行实例化，kt中没有new关键字
    var b: Int = 4

    //写了主构造器，能写其他构造器就用this代理主构造器
    /*  constructor(username: String, age: Int){
      }
      constructor(b: Int) {
          this.b = b
      }*/


    fun foo() {
        firstClass.change//通过类名.来获取属性及方法
        firstClass.foo()
    }
}

class ThreeClass() {
    var a = 5
        get() {
            return field + 2008//field只能在get和set方法中使用，用来代替变量的value
        }
        set(value) {
            field = value
        }
    var b = 9
        get
        set

    lateinit var c: String//lateinit用来延迟初始化， 不然在声明变量的时候都必须初始化,只能用于变量var
}

class FourClass(var a: Int) { //主构造器里面申明的变量可以在类范围使用

    init { //类的初始化方法，值的初始化放在init方法里面
        println("init  a  的值是$a")
    }

    fun cc() {
        a = 9
        println("cc  a  的值 是$a")
    }
}


class Five(a: Int, c: String) { //主构造函数如果有参数，那么次构造函数也必需接收这些参数，并为主构造函数代理，使用this关键字
    constructor(b: String, a: Int, c: String) : this(a, c) {

    }
}

open class animal(a: Int) { //open修饰的类才能被继承，默认是被final修饰
    open fun foo() { //open修饰的方法才能被重写，默认是final修饰

    }
}

class person : animal(5) {
    //继承用:格式,如果父类有传参构造方法，那么子类必须实现它
    override fun foo() {

    }
}


abstract class six(a: Int) { //abstract修饰抽象类 抽象类不需要用open修饰，也可以被继承
    abstract fun foo() //abstract修饰抽象方法，也可以不用open修饰
}

class seven : six(8) {
    override fun foo() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}

class eight() {
    class nine(a: Int) { //调用嵌套类使用：外部类.嵌套类.属性（方法）
        fun foo() = 8
    }
}


class head {
    var a = 100
    fun b() = 99
    inner class foot() { //内部类用inner 修饰，内部类持有外部类的引用，所以能直接访问外部类的属性和方法
        var c = a
        fun d() {
            var e = b()
        }
    }
}

class book : Any() //所有的类都默认继承自any类。


open class Person(name: String)

class student(name: String, height: Int) : Person(name) //子类有主构造函数，则基类必须在主构造函数中立即初始化

class teacher : Person {  //子类没有主构造函数，则必须在每一个次构造函数中,用super关键字实例化父类
    constructor(name: String) : super(name) {

    }

    constructor(height: Int, name: String) : super(name) {

    }

}


open class A {
    open val a = 99 //属性被open修饰，可以被重写
    open fun foo() {
        println("A")
    }
}

interface B {
    fun foo() { //接口的方法默认是open
        println("B")
    }
}

class C : A(), B { //子类c继承A和实现B,如果A和B有相同的方法，则子类C必须重写这个方法，我们可以用super<>关键字调用哪个父类的方法
    override fun foo() {  //kotlin和java一样，也不能多继承
        super<A>.foo()
        super<B>.foo()
    }

    override var a = 100  //val修饰的常量可以被重写成var变量，反之则不行
    fun d() {
        a = 999
    }

}

interface t {
    var a: Int //变量不允许被初始化，只能是抽象的
    fun b()
    fun c() { //方法可以有默认实现
        println("c")
    }

}

interface tf {
    fun b() {
        println("tf b")
    }

    fun c() {
        println("tf  c")
    }

}


class imp : t {  //实现接口，用: ，
    override var a: Int = 5//子类必须重写接口的属性值

    override fun b() { //没有默认实现的方法，必须重写
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}

class imp1 : t, tf {
    override var a: Int = 88

    override fun b() {//重写接口没被实现的方法，必须重写
        super<tf>.b()
    }

    override fun c() {//重写 两个接口都有的方法 必须重写
        super<t>.c()
        super<tf>.c()
    }

}
















































