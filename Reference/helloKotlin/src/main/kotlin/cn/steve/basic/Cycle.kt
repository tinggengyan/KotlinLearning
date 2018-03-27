package cn.steve.basic

/**
 * Created by steveyan on 11/4/17.
 */
fun main(args: Array<String>) {

    /**
     * for 循环
     */
    val items = listOf<String>("apple", "orange", "kiwi")
    for (index in items.indices) {
        println("item at $index is ${items[index]}")
    }

    for (item in items) {
        println(item)
    }

    /**
     * while 循环
     */

    var index = 0
    while (index in items.indices) {
        println("item at $index is ${items[index]}")
        index++
    }


    println(describe(""))

}

/**
 * when 表达式
 */
fun describe(obj: Any): String =
        when (obj) {

            1 -> "One"
            2 -> "Two"
            is Long -> "long"
            !is String -> "Not a String"

            else -> "nothing"

        }