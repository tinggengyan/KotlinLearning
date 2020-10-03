package cn.steve.coroutines

import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking


fun main() = runBlocking {

    launch {
        delay(2000L)
        println("Task from runBlocking lunch")
    }


    // 创建协程作用域,挂起函数,会释放底层线程用于其他用途
    coroutineScope {

        launch {
            delay(5000L)
            println("task from nested launch")
        }


        delay(1000L)
        println("Task from coroutineScope")

    }


    println("Coroutine scope is over")


}