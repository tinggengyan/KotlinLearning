package cn.steve.oop


// 枚举类
enum class Direction {
    NORTH, SOUTH, WEST, EAST;
}


// 每个枚举都是枚举类的实例,所以可以传参
enum class COLOR(rgb: Int) {
    RED(123),
    BLUE(234);
}


enum class ProtocolState {
    WARNING {
        override fun getState(): ProtocolState {
            return WARNING
        }
    };

    abstract fun getState(): ProtocolState

}


fun main(args: Array<String>) {
    val values = Direction.values()
    for (value in values) {
//        println(value)
    }


    println(Direction.EAST.name)
    println(Direction.EAST.ordinal)


}