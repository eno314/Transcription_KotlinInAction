package seven

class Person {
    private val _attributes = hashMapOf<String, String>()

    fun setAttribute(attrName: String, value: String) {
        _attributes[attrName] = value
    }

    // mapを委譲プロパティとして使う
    val name: String by _attributes
}
