package com.thinkwithu.www.kotlindemo.weituo

/**
 * Author: sean
 * Date: 2019/5/6 11:33
 */
class Biaodi : Xiwan {
    override fun washing() {
        println("表弟不耐烦在洗碗")
    }

    var a = 4 + 5
    operator fun plus(a: Int) {

    }

    var cc = "aa"
        set(value) {
            field = "99"
        }


}