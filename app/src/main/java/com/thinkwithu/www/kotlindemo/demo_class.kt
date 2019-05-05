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
//    var c = C()
//    c.foo()

//    val user = User();
//    user.extension()

    /* val intarray = intArrayOf(4, 9, 6)
     intarray.extecsion()
     for (i in intarray) {
         println(i)
     }*/
//    entity(v())
//    val yn = yun();
//    yn.foo()

//    var a: String? = null
//    println(a.toString())

//    myclass.foo()
//    moon().sunDo(sun(
//    bb().bbDo(aa())
//    pp().dp(tt1())
//    pp1().dp(tt())
    val jack = mydata("jack", 18)
    val oldjack = jack.copy(age = 45)//copy方法对
    println(jack)
    println(oldjack)

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


class User//空类

//作用域在顶级包下
fun User.extension() {//扩展函数  以fun修饰，以类名.方法名进行扩展，对原类不产生任何影响
    println("我是扩展函数")
}

fun IntArray.extecsion() { //有了扩展函数之后 就可以很方便的对系统函数进行扩展了
    var a = this[0]
    this[0] = this[2]
    this[2] = a
}

//扩展函数是静态解析的，并不是接收者类型的虚拟成员,到底执行哪个扩展函数，是由调用者直接决定的，而不是由动态调用者决定，
//换句话说如果是父类调用扩展函数，而子类也有该扩展函数，当传入的对象是子类时，也是有父类执行扩展函数
open class w

class v : w()

fun w.foo() {
    println("我是w的扩展函数")
}

fun v.foo() {
    println("我是v的扩展函数")
}

fun entity(w1: w) {
    w1.foo()
}


//当扩展函数和成员函数相同时，会优先调用成员函数
class yun {
    fun foo() {
        println("成员")
    }
}

fun yun.foo() {
    println("扩展")
}

//null也可以有扩展函数
fun Any?.haha() {

}

//扩展属性 ,只能支持val，由于没有filed，所以不能被初始化，只能显示初始化
//只能定义在类和kt文件中，不允许定义在方法中
val User.to: Int
    get() {
        return 4
    }

fun User.text() {
    val a = 8
    println(this.to)
}


//伴生对象
class myclass {
    companion object {

    }
}

fun myclass.Companion.foo() {
    println("我是伴生对象的扩展方法啊")
}


class sun {
    fun speak() {
        println("我是太阳，在说话")
    }
}


class moon {

    fun hahaa() {
        println("我是月亮的哈哈")
    }

    //当一个类的扩展函数是另一个类的成员函数时，这个函数内既可以调用扩展接受者的成员函数，也可以调用分发接收者的成员函数
    //这个方法的作用域只能在该类中
    fun sun.sing() {
        speak()
        hahaa()
        println("我是太阳，在唱歌")
    }

    fun sunDo(s: sun) {
        s.sing()
    }


}


class aa {
    fun foo() {
        println("aa foo")
    }
}

class bb {
    fun foo() {
        println("bb foo")
    }

    fun aa.other() {
        foo() //当扩展接受者和分发接收者都有同样的方法时，会优先调用扩展接收者
        this@bb.foo()//可以使用this关键字@类名调用分发接收者的方法
        println("other")
    }

    fun bbDo(a: aa) {
        a.other()
    }

}


open class tt

class tt1 : tt()


open class pp {

    open fun tt.dt() {
        println("pp里面的tt")
    }

    open fun tt1.dt() {
        println("pp里面的tt1")
    }

    fun dp(t: tt) { //针对扩展接收者，仍然是静态的，不会因为动态类型而改变
        t.dt()
    }
}


//针对扩展接收者和分发接收者而言，扩展接收者重写之后也是属于静态解析，而分发接收者 则不同
class pp1 : pp() {
    override fun tt.dt() {  //方法被重写了，用pp1去调用也会生效，
        println("pp1 里面的tt")
    }

    override fun tt1.dt() {
        println("pp1 里面的tt1")
    }

}

//数据类 用data 关键字修饰，主构造方法必须有参数，可以用copy方法复制数据对象的数据
data class mydata(val name: String, val age: Int)

























































































