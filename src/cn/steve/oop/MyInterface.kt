package cn.steve.oop

interface MyInterface {

    val prop: Int // 抽象的

    // 提供了访问器的实现
    val propertyWithImplementation: String
        get() = "foo"

    fun bar()

    fun foo(): Unit {
        println(prop)
    }

}


class Child : MyInterface {
    override val prop: Int
        get() = 29

    override fun bar() {
        println("bar method")
    }
}


// 解决覆盖冲突
interface InterfaceA {
    fun foo(): Unit {
        println("A")
    }

    fun bar()
}

interface InterfaceB {
    fun foo(): Unit {
        println("B")
    }

    fun bar() {
        println("bar")
    }

}


class InterfaceImpl : InterfaceA, InterfaceB {
    override fun foo() {
        super<InterfaceA>.foo()
        super<InterfaceB>.foo()
    }

    override fun bar() {
        super<InterfaceB>.bar()
    }

}


fun main(args: Array<String>) {


    var imp = InterfaceImpl()
    imp.bar()
    imp.foo()


}