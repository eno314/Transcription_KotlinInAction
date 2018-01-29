package seven

class Person {
    private val _attributes = hashMapOf<String, String>()

    fun setAttribute(attrName: String, value: String) {
        _attributes[attrName] = value
    }

    // 手動でmapから属性を取り出すl
    val name: String
        get() = _attributes["name"]!!
}
