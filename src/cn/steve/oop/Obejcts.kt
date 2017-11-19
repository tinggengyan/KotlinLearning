package cn.steve.oop

fun main(args: Array<String>) {

    val classman = ClassMan()
    // 对象表达式
    classman.setMan(object : Man("Steveyan") {
        override fun sayHello() {

            println("hello world")
        }

    })

    // 声明一个对象

    val xiaoming = object : Man("xiaoming") {
        override fun sayHello() {
            println(name + "say hello")
        }
    }


    xiaoming.sayHello()

    // 仅仅需要一个对象,但不需要继承一个类,或者

    val steve = object {
        val name = "steve"
        val age = 18
    }

    println(steve.name + steve.age)

}

class ClassMan {

    fun setMan(man: Man): Unit {
        man.sayHello()
    }
}

abstract class Man(var name: String) {

    abstract fun sayHello()
}


class CC {


    // 私有函数,所以其返回类型是匿名对象类型
    private fun foo() = object {
        val x: String = "X"
    }


    // 公有函数,所以其返回类型是 Any
    fun publicFoo() = object {
        val x: String = "Y"
    }

    fun bar(): Unit {
        val x1 = foo().x
    }
}

