package ten

import kotlin.reflect.full.memberProperties

fun main(args: Array<String>) {
    val person = Person("Alice", 29)
    // kClass<Person>のインスタンスを返す
    val kClass = person.javaClass.kotlin
    println(kClass.simpleName)
    kClass.memberProperties.forEach { println(it.name) }
}

@Deprecated("Use removeAt(index) instead.", ReplaceWith("removeAt(index)"))
fun remove(index: Int) {
    // ...
}

fun removeAt(index: Int) {
    // ...
}
