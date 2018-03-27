package cn.steve.basic

/**
 * Created by steveyan on 11/4/17.
 */
fun main(args: Array<String>) {
    var a = 1
    // 模板中的简单名称

    val s1 = "a is $a"


    a = 2
    // 模板中的任意表达式
    var s2 = "${s1.replace("is", "was")},but now is $a"


    println(s2)
}