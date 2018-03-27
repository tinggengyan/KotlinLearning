package cn.steve.oop

class Box<T>(t: T) {
    var value = t
    fun hello(): Unit {
        println(value)
    }
}

fun main(args: Array<String>) {

    // 声明范型类型
    val box = Box<Int>(1)
    // 类型可以推导则无需声明范型
    val box2 = Box(1)


}
