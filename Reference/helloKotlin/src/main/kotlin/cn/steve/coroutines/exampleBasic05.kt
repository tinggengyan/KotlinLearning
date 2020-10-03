package cn.steve.coroutines

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking


// runBlocking构建一个外部协程,等到作用域内的所有协程执行完毕,自行结束
// 阻塞当前线程
fun main() = runBlocking {

    // 作用域内启动一个新的协程
    launch {
        delay(1000L)
        println("World!")
    }

    println("Hello,")

}