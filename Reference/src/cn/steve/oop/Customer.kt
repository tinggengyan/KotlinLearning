package cn.steve.oop

/**
 * Created by steveyan on 11/5/17.
 */
class Customer constructor(name: String, val cId: Int = 0) {

    // 声明次构造函数,但是必须委托到主构造函数,间接或直接都行
    constructor(person: Person) : this(person.name, person.age) {

    }

    // 委托到同一个类的另一个构造函数用 this 关键字即可
    constructor(sex: String) : this(Person("steve", 12)) {

    }


    // 主构造函数不能包含任何的代码。初始化的代码可以放到以 init 关键字作为前缀的初始化块

    init {
        println("Customer initialized with value ${name}")
    }

    val mName = name.toUpperCase()

    fun sayHi(): Unit {
        println("可以直接访问属性cId,因为这个属性当作成员属性进行初始化了 $cId")
//        println("但是不能访问 name 属性,因为那不是成员属性 $name")
    }


}


fun main(args: Array<String>) {
    val cus = Customer("steve")
}