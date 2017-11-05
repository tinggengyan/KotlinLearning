package cn.steve.oop

open class Base {

    open fun f(): Unit {

        println("Base 中的方法 f")
    }

}


abstract class Derived : Base() {

    // 可以用一个抽象成覆盖一个非抽象成员
    abstract override fun f()

}


class DerivedImpl : Derived() {
    override fun f() {

    }
}

fun main(args: Array<String>) {
    val impl = DerivedImpl()
    impl.f()
}

