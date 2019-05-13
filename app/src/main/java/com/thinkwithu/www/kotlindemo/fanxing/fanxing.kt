package com.thinkwithu.www.kotlindemo.fanxing

/**
 * Author: sean
 * Date: 2019/5/8 10:17
 */

fun main(args: Array<String>) {
    aaa.cc()
}

abstract class annimal

class Dog : annimal()

class cat : annimal()

open class Box<T>(thing: T)

class AnnimalBox(annimal: annimal) : Box<annimal>(annimal)


class aaa() {
    companion object {
        var a = ""
        fun cc() {

        }
    }
}
