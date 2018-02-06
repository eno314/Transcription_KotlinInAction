package ten

import ru.yole.jkid.DeserializeInterface

interface Company {
    val name: String
}

data class CompanyImpl(override val name: String) : Company
