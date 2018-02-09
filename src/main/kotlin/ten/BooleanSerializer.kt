package ten

import ru.yole.jkid.deserialization.JKidException

object BooleanSerializer : ValueSerializer<Boolean> {

    override fun toJsonValue(value: Boolean) = value

    override fun fromJsonValue(jsonValue: Any?): Boolean {
        if (jsonValue !is Boolean) throw JKidException("Boolean expected")
        return jsonValue
    }
}