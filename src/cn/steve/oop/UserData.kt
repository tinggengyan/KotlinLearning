package cn.steve.oop

data class UserData(var name: String, val age: Int, var cl: String)


fun main(args: Array<String>) {
    val user = UserData("steve", 12, "m")
    val steve = user.copy(age = 21)

    val (a) = steve
    val (b: String, c: Int, d: String) = steve

    println("name: $a age: $b")


}