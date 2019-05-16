package com.thinkwithu.www.kotlindemo.dsl

/**
 * Author: sean
 * Date: 2019/5/14 11:15
 */

/**
 * <html>
 *     <body>
 *    </body>
</html>
 */

fun main() {
    //高阶函数
    val html = html {
        head {

        }
        body {
            div {

            }
        }

    }
    println(html)
}

fun Body.div(block: () -> Unit) {
    val d=Div()
    setTag(d)
}


fun html(block: Html.() -> Unit): Html {
    val h = Html()
    block(h)
    return h
}

fun Html.body(block:Body.() -> Unit) {
    val b = Body()
    block(b)
    setTag(b)
}

fun Html.head(block: () -> Unit) {
    val h = Head()
    setTag(h)
}


open class Tag(val name: String) {
    val list = ArrayList<Tag>()

    fun setTag(tag: Tag) {
        list.add(tag)
    }

    override fun toString(): String {
        val stringBuilder = StringBuilder()
        stringBuilder.append("<$name>")
        list.forEach { stringBuilder.append(it.toString()) }
        stringBuilder.append("</$name>")
        return stringBuilder.toString()
    }
}

class Html : Tag("html")
class Body : Tag("body")
class Head : Tag("head")
class Div : Tag("div")
