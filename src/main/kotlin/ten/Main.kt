package ten

import ru.yole.jkid.joinToStringBuilder
import kotlin.reflect.KAnnotatedElement
import kotlin.reflect.full.memberProperties

var counter = 0

fun main(args: Array<String>) {
    val person = Person("Alice", 29)
    val kClass = person.javaClass.kotlin
    val properties = kClass.memberProperties
            .filter { it.findAnnotation<JsonExclude>() == null }
}

inline fun <reified T> KAnnotatedElement.findAnnotation(): T? = annotations.filterIsInstance<T>().firstOrNull()

/*
private fun StringBuilder.serializeObject(obj: Any) {
    // オブジェクトに対するKClassを取得
    val kClass = obj.javaClass.kotlin
    // クラスの全てのプロパティを取得
    val properties = kClass.memberProperties

    properties.joinToStringBuilder(this, prefix = "{", postfix = "}") { prop ->
        // プロパティ名を取得
        serializeString(prop.name)
        append(": ")
        // プロパティの値を取得
        serializePropertyValue(prop.get(obj))
    }
}
*/

fun sum(x: Int, y: Int) = x + y

fun foo(x: Int) = println(x)

@Deprecated("Use removeAt(index) instead.", ReplaceWith("removeAt(index)"))
fun remove(index: Int) {
    // ...
}

fun removeAt(index: Int) {
    // ...
}
