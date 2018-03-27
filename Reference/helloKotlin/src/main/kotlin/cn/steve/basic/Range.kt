package cn.steve.basic

/**
 * Created by steveyan on 11/4/17.
 */

fun main(args: Array<String>) {

    val x = 10
    val y = 9

    if (x in 1..y + 1) {
        print("fits in range")
    }


    for (x in 1..10 step 2) {
        println(x)
    }

    for (x in 9 downTo 0 step 3) {
        println(x)
    }


}