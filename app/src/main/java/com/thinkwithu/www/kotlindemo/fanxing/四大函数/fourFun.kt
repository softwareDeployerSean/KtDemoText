package com.thinkwithu.www.kotlindemo.fanxing.四大函数


/**
 * Author: sean
 * Date: 2019/5/13 11:33
 */

fun main(args: Array<String>) {
    val list = arrayListOf<String>("aaa")
    /**
     * 1.任何类型的扩展方法
     * 2.参数是有接收者的函数
     * 返回值是自己
     */
    list.apply {
        add("222")
        add("222")
    }

    /**
     * 1.参数是有一个参数的函数，参数函数的返回值是泛型R
     * 函数的返回值是参数函数的返回值
     */
    list.let {
        it.add("44")
        "ssss"
    }.length

    /**
     * 相当于是apply和let方法的合成题
     * 有两个参数，第一个参数是任意类型，第二个参数是有接收类型的函数，
     * 函数的返回值是第二个函数参数的返回值
     */
    with(8, {
        toString()
        "aaa"
    }).length

    /*
    1.参数是有接收类型的函数，接收类型是调用类型
    函数的返回值是函数参数的返回值
     */
    list.run {
        add("aaa")
        "rrrr"
    }.toString()


}

