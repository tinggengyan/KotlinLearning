package cn.steve.basic

/**
 * Created by steveyan on 11/4/17.
 */
fun main(args: Array<String>) {

    val items = listOf<String>("apple", "orange", "kiwi", "ann")
    for (item in items) {
        when (item) {
            "orange" -> println("juicy")
            "apple" -> println("apple is fine too")
        }
    }


    items.filter { it.startsWith("a") }
            .sortedBy { it }
            .map {
                it.toUpperCase()
            }
            .forEach { println(it) }


    val map = mapOf("a" to 1, "b" to 2, "c" to 3)
    for ((k, v) in map) {
        println("$k ----> $v")
    }

    println("b------------> ${map["b"]} ")

    "HelloWorld".spaceToCameCase()

}


fun String.spaceToCameCase() {
    println("implment by custom ${toString()}")
}