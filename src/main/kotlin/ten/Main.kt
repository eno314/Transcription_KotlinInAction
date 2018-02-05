package ten

import ru.yole.jkid.serialization.serialize

fun main(args: Array<String>) {
    val person = Person("Alice", 29)
    println(serialize(person))
}

@Deprecated("Use removeAt(index) instead.", ReplaceWith("removeAt(index)"))
fun remove(index: Int) {
    // ...
}

fun removeAt(index: Int) {
    // ...
}
