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

fun <T> asList(vararg ts: T): List<T> {

    val result = ArrayList<T>()
    for (t in ts) {
        result.add(t)
    }
    return result
}

infix fun Int.sh1(x: Int): Int {
    return x + x
}

fun main(args: Array<String>) {

//    println(sum(1, 2))
//    sum_3(3, 4)

    // 可变数量参数
//    val a = arrayOf(1, 2, 3)
//    val list = asList(*a, 4, 5, 6, 7, 8, 9)
//    for (i in list) {
//        println(i)
//    }

    //中缀表示法
    //他们是成员函数或扩展函数； 他们只有一个参数； 他们用 infix 关键字标注。

    println(5.sh1(9))
    println(5 sh1 9)


}