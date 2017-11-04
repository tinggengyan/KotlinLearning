package cn.steve.basic

/**
 * Created by steveyan on 11/4/17.
 */

/**
 * 函数定义了两个参数和一个返回值类型
 */
fun sum(a: Int, b: Int): Int {
    return a + b
}


/**
 * 表达式作为函数体,返回值类型将会进行自动推断
 */
fun sum_1(a: Int, b: Int) = a + b

/**
 * 函数返回无意义的值
 */
fun sum_2(a: Int, b: Int): Unit {

    println("sum of $a and $b is ${a + b}")
}

/**
 * 对于返回值类型为 Unit 的可以进行省略
 */
fun sum_3(a: Int, b: Int) {
    println("sum of $a and $b is ${a + b}")
}


fun main(args: Array<String>) {
    println(sum(1, 2))
    sum_3(3, 4)
}