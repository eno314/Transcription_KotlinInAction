package ten

import ru.yole.jkid.CustomSerializer
import java.util.*

data class Person(
        val name: String,
        @CustomSerializer(DateSerializer::class)
        val birthDate: Date
)
