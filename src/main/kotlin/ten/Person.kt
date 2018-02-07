package ten

import ru.yole.jkid.JsonName

// annotation class JsonName(val name: String)

class Person(
        @JsonName("alias")
        val firstName: String,
        val age: Int
)
