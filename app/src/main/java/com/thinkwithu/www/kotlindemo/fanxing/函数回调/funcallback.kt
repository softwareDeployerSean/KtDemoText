package com.thinkwithu.www.kotlindemo.fanxing.函数回调

/**
 * Author: sean
 * Date: 2019/5/13 14:51
 */


fun main() {
    val us = usa()
    us.chinesehome({
        it.copy()
    })
}

data class xinpian(var name: String)

class aaa(aaa5: Int) {
}

class aaa1(var int5: Int) {
    fun cc(){
        int5=9
    }
}

class chinese() {
    val us = usa()

}

class usa() {
    fun chinesehome(f: (xinpian) -> Unit) {
        val xinpian = xinpian("小霸王")
        f.invoke(xinpian)
    }
}


