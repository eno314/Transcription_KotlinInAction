package ten

import ru.yole.jkid.CustomSerializer
import ru.yole.jkid.joinToStringBuilder
import kotlin.reflect.KAnnotatedElement
import kotlin.reflect.KProperty
import kotlin.reflect.KProperty1
import kotlin.reflect.full.createInstance
import kotlin.reflect.full.memberProperties

var counter = 0

fun main(args: Array<String>) {

}

fun KProperty<*>.getSerializer(): ValueSerializer<Any?>? {
    val customSerializer = findAnnotation<CustomSerializer>() ?: return null
    val serializerClass = customSerializer.serializerClass

    val valueSerializer = serializerClass.objectInstance ?: serializerClass.createInstance()

    @Suppress("UNCHECKED_CAST")
    return valueSerializer as ValueSerializer<Any?>
}

private fun StringBuilder.serializeObject(obj: Any) {
    obj.javaClass.kotlin.memberProperties
            .filter { it.findAnnotation<JsonExclude>() == null }
            .joinToStringBuilder(this, prefix = "{", postfix = "}") {
                // serializeProperty(it, obj)
            }
}

private fun StringBuilder.serializeProperty(prop: KProperty1<Any, *>, obj: Any) {
    val jsonNameAnn = prop.findAnnotation<JsonName>()
    val propName = jsonNameAnn?.name ?: prop.name
    // serializeString(propName)
    append(": ")

    val value = prop.get(obj)

    // プロパティに対するカスタムシリアライザがあれば使う
    // カスタムシリアライザを使わないのなら、以前のようにプロパティの値を使う
    val jsonValue = prop.getSerializer()?.toJsonValue(value) ?: value
    // serializePropertyValue(jsonValue)
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
