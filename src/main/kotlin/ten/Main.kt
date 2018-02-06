package ten

import ru.yole.jkid.deserialization.deserialize
import ru.yole.jkid.serialization.serialize
import java.text.SimpleDateFormat

fun main(args: Array<String>) {
    val person = Person("Alice", SimpleDateFormat("dd-mm-yyyy").parse("13-02-1987"))
    println(serialize(person))

    val json = """{"birthDate": "13-02-1987", "name": "Alice"}"""
    println(deserialize<Person>(json))
}

@Deprecated("Use removeAt(index) instead.", ReplaceWith("removeAt(index)"))
fun remove(index: Int) {
    // ...
}

fun removeAt(index: Int) {
    // ...
}
