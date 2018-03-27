package cn.steve.other

class Destructuring {
    val name: String = "steve"
    val age: Int = 18
    val study = "A"
    operator fun component1(): String {
        return name
    }

    operator fun component2(): Int {
        return age
    }

    operator fun component3(): String {
        return study
    }
}

data class Result(val result: Int, val status: Destructuring)

fun getResult(): Result {
    return Result(1, Destructuring())
}


fun main(args: Array<String>) {
    val des = Destructuring()
    // 对于不使用的解析参数,可以使用下划线代替
    val (_, _, b) = des
    println("b" + b)


    // 因为数据类默认实现了解构函数,直接使用即可
    val (c, d) = getResult()
    println("C:" + c)
    println("d:" + d.name)


}