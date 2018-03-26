package cn.steve.oop

// 可以被继承的类都必须显式的声明为 open
open class Father(val name: String) : Any() {

    // 可以被覆写的方法必须要显式的声明为open
    open fun sayHello(): Unit {
        println("hello i'm father $name")
    }

    // 这种未进行标记的方法是不能被覆写的
    fun notOverrideMethod(): Unit {

        println("不可覆写的方法")
    }
}

// 默认的所有的类都是final 类型的,都是不能继承的
class Son(age: Int) : Father("son") {

    // 必须显式的加上 override 标记为覆写父类的方法,不然编译器会报错
    override fun sayHello() {

        println("$name 覆写了父类的方法")
    }

    // 对于覆写了的方法,想要接下来禁止覆写,需要用final 修饰
}


fun main(args: Array<String>) {
    val l = Father("father")

    val s = Son(12)
    s.sayHello()

    s.notOverrideMethod()
}