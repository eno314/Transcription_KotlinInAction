package ten

import kotlin.reflect.KClass
import kotlin.reflect.KParameter
import kotlin.reflect.full.primaryConstructor

class ClassInfo<T : Any>(cls: KClass<T>) {
    private val constructor = cls.primaryConstructor!!

    private val jsonNameToParamMap = hashMapOf<String, KParameter>()

    private val paramToSerializerMap = hashMapOf<KParameter, ValueSerializer<out Any?>>()

    private val jsonNameToDeserializeClassMap = hashMapOf<String, Class<out Any>?>()

    init {
        constructor.parameters.forEach { cacheDataForParameter(cls, it) }
    }

    fun getConstructorParameter(propertyName: String): KParameter = jsonNameToParamMap[propertyName]!!

    fun deserializeCOnstructorArgument(param: KParameter, value: Any?): Any? {
        val serializer = paramToSerializerMap[param]
        if (serializer != null) {
            return serializer.fromJsonValue(value)
        }
        validateArgumentType(param, value)
        return value
    }

    fun createInstance(arguments: Map<KParameter, Any?>): T {
        ensureAllParamterPresent(arguments)
        return constructor.callBy(arguments)
    }
    // ...
}