package ten

import ru.yole.jkid.deserialization.ClassInfoCache
import ru.yole.jkid.deserialization.ObjectSeed
import kotlin.reflect.KClass

/*
fun <T : Any> deserialize(json: Reader, targetClass: KClass<T>): T {
    val seed = ObjectSeed(targetClass, ClassInfoCache())
    Pasrer(json, seed).parse()
    return seed.spawn()
}
*/
