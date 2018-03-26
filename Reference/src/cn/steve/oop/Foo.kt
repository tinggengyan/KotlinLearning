package cn.steve.oop

open class Foo {

    // val 本质上就一个 get 方法
    open val x: Int
        get() {
            return x + 10
        }

    open var y: Int = 0


    open fun foo(): Unit {
        println("外部类的方法")
    }

}

class Bar2 : Foo() {


    override var x: Int = 0

    // var 变量本质上是有 set 和 get 方法
    override var y: Int
        get() = super.y
        set(value) {
            println("set value $value")
            super.y += value
        }

    override fun foo() {
        println("Bar 覆写了 foo 方法")
    }


    inner class Baz {
        fun g(): Unit {
            super@Bar2.foo() // 调用 Bar2 超类的 foo 方法,即:Foo 的 foo 方法
            println("最外层的x值: ${super@Bar2.x}")
        }
    }

}


fun main(args: Array<String>) {

    val bar = Bar2()

    bar.y = 10

    println(bar.y)

    val baz = bar.Baz()
    baz.g()

}