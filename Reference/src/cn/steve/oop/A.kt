package cn.steve.oop

open class A {

    open fun f(): Unit {
        println("A")
    }

    fun a(): Unit {
        println("a")
    }

}


/**
 * 接口默认的所有方法默认实现都是 open 的
 */
interface B {

    fun f(): Unit {
        println("B")
    }

    fun b(): Unit {
        println("b")
    }
}


class C : A(), B {
    override fun f() {

        // 尖括号显式指定覆写哪个类的方法
        super<A>.f()
        super<B>.f()

    }
}


fun main(args: Array<String>) {
    val c = C()
    c.f()
}
