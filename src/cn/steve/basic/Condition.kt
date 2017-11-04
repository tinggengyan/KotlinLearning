package cn.steve.basic

/**
 * Created by steveyan on 11/4/17.
 */

fun maxOf(a: Int, b: Int): Int {
    if (a > b) {
        return a
    } else {
        return b
    }
}

fun maxOf2(a: Int, b: Int) = if (a > b) a else b


fun main(args: Array<String>) {
    var b = maxOf2(3, 4)
    println(b)
}