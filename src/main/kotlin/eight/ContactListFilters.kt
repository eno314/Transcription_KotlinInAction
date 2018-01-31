package eight

class ContactListFilters {
    var prefix: String = ""
    var onlyWithPhoneNumber: Boolean = false

    // 関数を返す関数の宣言
    fun getPredicate(): (Person) -> Boolean {
        val startsWithPrefix = { p: Person ->
            p.firstName.startsWith(prefix) || p.lastName.startsWith(prefix)
        }
        if (onlyWithPhoneNumber) {
            // 関数型の変数を返す
            return startsWithPrefix
        }
        // この関数からラムダを返す
        return {
            startsWithPrefix(it) && it.phoneNumber != null
        }
    }
}
