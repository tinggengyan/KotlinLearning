package cn.steve.oop

// 未进行显式声明主构造函数的时候,系统默认会为类提供一个空参的构造函数
class DefaultConstructor {

}

// 当不需要一个隐的无参主构造函数,则需要显式的声明一个隐式的私有构造函数
class DefaultConstructor2 private constructor(name: String) {
    private constructor() : this("")
    constructor(age: Int) : this("")

}

fun main(args: Array<String>) {
    val defalutConcstuctor = DefaultConstructor()
    val defaultConstructor2 = DefaultConstructor2(2)

}