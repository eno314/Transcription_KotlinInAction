package ten

fun main(args: Array<String>) {
    remove(1)
}

@Deprecated("Use removeAt(index) instead.", ReplaceWith("removeAt(index)"))
fun remove(index: Int) {
    // ...
}

fun removeAt(index: Int) {
    // ...
}
