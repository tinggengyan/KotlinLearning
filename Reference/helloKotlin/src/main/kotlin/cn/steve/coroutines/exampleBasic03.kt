package cn.steve.coroutines

import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking

fun main() {


    val result = runBlocking {

        delay(1000L)

        "block result"
    }


    println(result)

    println("End")

}