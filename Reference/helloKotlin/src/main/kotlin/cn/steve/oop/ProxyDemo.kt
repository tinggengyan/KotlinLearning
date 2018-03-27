package cn.steve.oop

import kotlin.properties.Delegates
import kotlin.reflect.KProperty

interface BaseInterface {
    fun print()
}

class BaseImplements(x: Int) : BaseInterface {
    override fun print() {
        println("BaseImplemnts print")
    }
}

// by 表示委托的对象
class DerivedObj(b: BaseInterface) : BaseInterface by b


class Example {

    var p: String by Delegate()
}

class Delegate {
    operator fun getValue(thisRef: Example, property: KProperty<*>): String {
        return "$thisRef, thank you for delegating  '${property.name}' to me! "
    }

    operator fun setValue(thisRef: Example, property: KProperty<*>, value: String) {


        println("$value has been assigned to ${property.name}  in $thisRef")
    }

}


val lazyValue: String by lazy(

        LazyThreadSafetyMode.NONE,

        {
            println("computed")
            "hello world2"
        }
)


class UserClass {
    var name: String by Delegates.observable("no value") { property, oldValue, newValue ->
        println("$oldValue   -> $newValue")
    }
}


class UserMap(val map: Map<String, Any?>) {
    val name: String by map
    val age: Int by map

}

fun main(args: Array<String>) {

//    val b = BaseImplements(10)
//    DerivedObj(b).print()

//    val e = Example()
//    e.p = "NEW"
//    println(e.p)


//    println(lazyValue)
//    println(lazyValue)


//    val uu = UserClass()
//    uu.name = "first"
//    uu.name = "second"


//    val user = UserMap(mapOf(
//            "name" to "steveyan",
//            "age" to 25
//    ))
//    println(user.name)


}
