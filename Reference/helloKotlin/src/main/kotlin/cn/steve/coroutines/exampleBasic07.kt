package cn.steve.coroutines

import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking


fun main() = runBlocking {

    val async1 = async {
        delay(2000L)
        println("async1")
        1
    }

    val async2 = async {
        delay(1000L)
        println("async2")
        2
    }

    println("async1 result:${async1.await()}")
    println("async2 result:${async2.await()}")
    println("main is over")

}