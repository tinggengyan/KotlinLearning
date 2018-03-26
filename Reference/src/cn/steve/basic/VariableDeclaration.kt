package cn.steve.basic

/**
 * Created by steveyan on 11/4/17.
 */


/**
 * 顶层变量
 */
val PI = 3.14
var x = 0

/**
 * 这是多行块注释
 * // 这里嵌套一个行注释
 * // 继续嵌套一个行注释
 */

fun main(args: Array<String>) {
    /**
     * 一次性赋值(只读)的局部变量,只能进行一次赋值
     */
    // 定义类型并且赋值
    val a: Int = 1
    // 直接赋值,自动推断类型
    val b = 2
    // 先定义类型,不能省略类型声明
    val c: Int
    c = 9

    /**
     * 可变的变量
     */
    var x = 5
    x += 4


}