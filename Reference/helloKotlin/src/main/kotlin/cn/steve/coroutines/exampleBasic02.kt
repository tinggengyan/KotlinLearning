package cn.steve.coroutines

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() {

    GlobalScope.launch {
        // 非阻塞操作
        delay(1000L)
        println("World!")
    }

    println("Hello,")

    // 阻塞操作
    runBlocking {
        // 内部非阻塞操作
        delay(2000L)

    }

    println("End")

}