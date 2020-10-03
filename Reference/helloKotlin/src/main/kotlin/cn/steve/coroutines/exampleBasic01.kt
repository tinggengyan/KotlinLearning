package cn.steve.coroutines

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

fun main() {

    GlobalScope.launch {
        // 非阻塞操作
        delay(1000L)
        println("World!at thread:" + Thread.currentThread())
    }

    println("Hello," + Thread.currentThread())

    // 阻塞操作
    Thread.sleep(2000L)
}