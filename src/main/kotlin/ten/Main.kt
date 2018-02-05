package ten

import ru.yole.jkid.deserialization.deserialize
import ru.yole.jkid.serialization.serialize

fun main(args: Array<String>) {
    val json = """{"alias": "Alice"}"""
    println(deserialize<Person>(json))

    val person = Person("hoge", 100)
    println(serialize(person))
}

@Deprecated("Use removeAt(index) instead.", ReplaceWith("removeAt(index)"))
fun remove(index: Int) {
    // ...
}

fun removeAt(index: Int) {
    // ...
}
