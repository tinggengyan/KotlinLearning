package cn.steve.oop

fun <T> MutableList<T>.swap(index1: Int, index2: Int) {

    val tmp = this[index1]
    this[index1] = this[index2]
    this[index2] = tmp

}


class MyClass {
    // 伴生对象
    companion object {

    }
}

fun MyClass.Companion.foo() {
    println("companion")
}


fun main(args: Array<String>) {
//    val l = mutableListOf(1, 2, 3)
//    l.swap(0, 2)
//    println(l)

    var my = MyClass()
    MyClass.foo()

}