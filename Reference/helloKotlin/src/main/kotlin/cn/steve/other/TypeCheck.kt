package cn.steve.other

fun main(args: Array<String>) {

    val s: String = "";
    println(s.length)


    val ss: String? = null
    println(ss?.length) // 返回 null


    val l = ss?.length ?: -1
    println(l)

//    createNPE(null)
    typeChange(s)
    typeChange(1)

}


fun createNPE(a: String?): Unit {
    // 主动要求为null就抛出空异常
    a!!.length
}

fun typeChange(a: Any): Unit {
    val aInt: Int? = a as? Int

    println(aInt)
}