package ten

import ru.yole.jkid.deserialization.ClassInfo
import ru.yole.jkid.deserialization.ClassInfoCache
import kotlin.reflect.KClass
import kotlin.reflect.KParameter
import kotlin.reflect.jvm.javaType

class ObjectSeed<out T : Any>(targetClass: KClass<T>, val classInfoCache: ClassInfoCache) : Seed {

    // targetClassのインスタンスを生成するために必要な情報をキャッチする
    private val classInfo: ClassInfo<T> = classInfoCache[targetClass]

    private val valueArguments = mutableMapOf<KParameter, Any?>()
    private val seedArguments = mutableMapOf<KParameter, Seed>()

    // コンストラクタの仮引数からそれらの値をほじするためのマップを組み立てる
    private val arguments: Map<KParameter, Any?>
        get() = valueArguments + seedArguments.mapValues { it.value.spawn() }

    override fun spawn(): Any? {
        return classInfo.createInstance(arguments)
    }

    override fun createCompositeProperty(propertyName: String, isList: Boolean): Seed {
        val param = classInfo.getConstructorParameter(propertyName)
        // プロパティにDeserializeInterfaceアノテーションがあれば、その値を読み取る
        val deserializeAs = classInfo.getDeserializeClass(propertyName)
        // プロパティにDeserializeInterfaceアノテーションがあれば、その値を読み取る
        val seed = createSeedForType(deserializeAs ?: param.type.javaType, isList)
        // 引数の型に応じてObjectSeedかCollectionSeedを生成する
        return seed.apply {
            // seedArgumentsというマップにもseedを保存する
            seedArguments[param] = this
        }
    }

    override fun setSimpleProperty(propertyName: String, value: Any?) {
        val param = classInfo.getConstructorParameter(propertyName)
        // 単純な値であれば、コンストラクタの引数の値を記録する
        valueArguments[param] = classInfo.deserializeConstructorArgument(param, value)
    }
}