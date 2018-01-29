package seven

class Person(val name: String) {
    val emails by lazy { loadEmails(this) }
}
