package ten

import ru.yole.jkid.BooleanSerializer
import ru.yole.jkid.ByteSerializer
import ru.yole.jkid.IntSerializer
import ru.yole.jkid.ValueSerializer
import java.lang.reflect.Type

interface ValueSerializer<T> {
    fun toJsonValue(value: T): Any?
    fun fromJsonValue(jsonValue: Any?): T
}

fun serializerForType(type: Type): ValueSerializer<out Any?>? =
        when (type) {
            Byte::class.java -> ByteSerializer
            Int::class.java -> IntSerializer
            Boolean::class.java -> BooleanSerializer
        // ...
            else -> null
        }
