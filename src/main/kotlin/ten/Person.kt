package ten

import ru.yole.jkid.DeserializeInterface

data class Person(
        val name: String,
        @DeserializeInterface(Company::class)
        val company: Company
)
