package ten

fun main(args: Array<String>) {
    val kFunction = ::foo
    kFunction.call(42)
}

fun foo(x: Int) = println(x)

@Deprecated("Use removeAt(index) instead.", ReplaceWith("removeAt(index)"))
fun remove(index: Int) {
    // ...
}

fun removeAt(index: Int) {
    // ...
}
