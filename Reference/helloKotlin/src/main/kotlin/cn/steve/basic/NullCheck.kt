package cn.steve.basic

import java.io.File

/**
 * Created by steveyan on 11/4/17.
 */

/**
 * ? 表示 类型可以为空
 */
fun parseInt(str: String?): Int? {
    //
    if (str == null)
        return null
    else
        return 2
}


fun printProduct(arg1: String, arg2: String) {
    val x = parseInt(arg1)
    val y = parseInt(arg2)
    // 直接使用x 或者y 可能会导致错误,因为它们可能是null
    if (x != null && y != null) {
        // 在进行空检测之后,x 和 y 会自动转成非空值
        println(x * y)
    } else {
        println("either ${arg1}  or '$arg2' is not a number")
    }
}


fun main(args: Array<String>) {

    val files = File("hello").listFiles()

    println(files?.size ?: "长度为null")

    println(files ?: "empty")

    files ?: println("执行一个语句")

    files?.let {
        // 当files 非空的时候执行这个代码块的内容
        for (file in files) {
            println(file.name + " is file:" + file.isFile)
        }
    } ?: println("代码块不能执行")


}


