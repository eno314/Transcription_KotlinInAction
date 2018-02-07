package ten

import ru.yole.jkid.CustomSerializer
import java.util.*

// annotation class JsonName(val name: String)

/*
annotation class CustomSerializer(
        val serializerClass: KClass<out ValueSerializer<*>>
)
*/

class Person(
        val Name: String,
        @CustomSerializer(DateSerializer::class)
        val birthDate: Date
)
