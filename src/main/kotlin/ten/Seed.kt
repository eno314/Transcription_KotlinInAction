package ten

interface Seed : JsonObject {

    fun span(): Any?

    fun createCompositeProperty(propertyName: String, isList: Boolean): JsonObject

    override fun createObject(propertyName: String): JsonObject {
        return createCompositeProperty(propertyName, false)
    }

    override fun createArray(propertyName: String): JsonObject {
        return createCompositeProperty(propertyName, true)
    }
}