package cn.steve.oop

/**
 * Created by steveyan on 11/5/17.
 */
class Person constructor(name: String, age: Int) {
    var name = name
    var age = age
    fun sayHello(): Unit {
        println("hello my name is ${name} and my age is $age")
    }
}


fun main(args: Array<String>) {

    val steve = Person("steve", 23)
    steve.sayHello()
}