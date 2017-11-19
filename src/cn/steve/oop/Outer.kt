package cn.steve.oop

class Outer {
    val value = 10


    // 当没有声明为 inner 内部类的时候,则作为嵌套类,嵌套类是不能访问外部类成员的
    inner class Inner {

        fun sout() {
            println(value)
        }

    }

}
