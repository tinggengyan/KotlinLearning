package cn.steve.oop

const val CONST_VALUE: String = "This is a const value"

class Address {

    var name: String = "steve"
    var street: String = "pengqinglu"
    var city: String = "shanghai"
    var state: String? = ""
    var age: Int = 0


    // 延迟初始化可以避开初始化检查
    lateinit var lateInitValue: String




    var allByDefault: Int?
        get() {
            return age + 10
        }
        set(value) {

        }

    var privateVisibleParam: String = "privateVisibleParam"
        private set


    var counter = 0 // 此初始器值直接写入到幕后字段
        set(value) {
            if (value >= 0)
                field = value
        }


}

fun copyAddress(address: Address): Address {
    var result = Address() // kotlin 没有 new 关键字
    result.name = address.name
    result.street = address.street
    result.city = address.city
    result.state = address.state
    return result
}


fun main(args: Array<String>) {

    val address = Address()
    address.counter = -100
    println(address.counter)

    println(CONST_VALUE)


}