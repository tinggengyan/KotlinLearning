package cn.steve.basic

/**
 * Created by steveyan on 11/4/17.
 */

fun main(args: Array<String>) {

    var oneMillion = 1_000_000
    println(oneMillion)


    var ch: Char = '9'
    var b = ch in '0'..'8'
    println("b:${b}")


    var ss: String = "hello world"
    for (s in ss) {
        print(s)
    }
    println()

    println("ss 下标为 6  的元素值: ${ss[6]}")


    // 转译字符,"""内容会原样输出,包括换行"""
    var s: String =
            """
         if (a>b){
        return a+b
         }
"""

    // 通过 trimMargin() 函数去除前导空格
    val text = """
    |Tell me and I forget.
    |Teach me and I remember.
    """.trimMargin()

    println(text.trimMargin())


    val price = """
                    ${'$'}9.99
                """

    println(price.trimMargin())


    loop@ for (i in 1..5) {
        println("外部循环 $i")
        for (j in 1..5) {
            println("内部循环 $j")
            if (j > 1)
            // 将会直接跳转到标签标记的地方退出
                break@loop
        }

    }
    loop@ for (i in 1..5) {
        println("外部循环 $i")
        for (j in 1..5) {
            println("内部循环 $j")
            if (j > 1)
            // 将会直接跳转到标签标记的地方继续执行
                continue@loop
        }

    }

    foo()
    foo2()
}

var ints = intArrayOf(0, 1, 2, 3, 4, 5)

fun foo() {
    ints.forEach {
        // 此处的返回是foo 的返回
        if (it == 0) {
            println("遇到0")
            return
        }

        print(it)
    }
    println("foo tail")

}

fun foo2() {

    ints.forEach here@ {
        // 此处的返回是lamada内部的返回
        if (it == 0) {
            println("遇到0")
            return@here
        }
        print(it)
    }
    println("foo tail")

}


fun foo3() {
    ints.forEach(
            fun(value: Int) {
                if (value == 0) return  // local return to the caller of the anonymous fun, i.e. the forEach loop
                print(value)
            }
    )

    println("foo2 tail")
}

