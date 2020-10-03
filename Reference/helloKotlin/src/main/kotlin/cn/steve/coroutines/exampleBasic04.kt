package cn.steve.coroutines

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() {


    runBlocking {
        // 创建一个顶层协程
        val job = GlobalScope.launch {
            delay(2000L)
            println("World!")
        }

        println("Hello,")


        // 等待子协程完成
        job.join()

        println("end")
    }


}