package ten

import ru.yole.jkid.deserialization.deserialize

fun main(args: Array<String>) {
    val json = """{"name": "Alice", "age": 29}"""
    println(deserialize<Person>(json))
}

@Deprecated("Use removeAt(index) instead.", ReplaceWith("removeAt(index)"))
fun remove(index: Int) {
    // ...
}

fun removeAt(index: Int) {
    // ...
}
