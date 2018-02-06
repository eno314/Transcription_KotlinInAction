package ten

import kotlin.reflect.KFunction2

fun main(args: Array<String>) {
    val kFunction: KFunction2<Int, Int, Int> = ::sum
    println(kFunction.invoke(1, 2) + kFunction(3, 4))

    // kFunction(1)
    // ERROR: No value passed for parameter p2
}

fun sum(x: Int, y: Int) = x + y

fun foo(x: Int) = println(x)

@Deprecated("Use removeAt(index) instead.", ReplaceWith("removeAt(index)"))
fun remove(index: Int) {
    // ...
}

fun removeAt(index: Int) {
    // ...
}
