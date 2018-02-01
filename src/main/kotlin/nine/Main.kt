package nine

fun main(args: Array<String>) {
    println(oneHalf(3))
}

// 型パラメータの上限境界としてNumberを指定
fun <T : Number> oneHalf(value: T): Double {
    // Nubmerクラスで定義されているメソッドの呼び出し
    return value.toDouble() / 2.0
}

// このジェネリック拡張プロパティは任意のリストで呼び出し可能
val <T> List<T>.penultimate: T
    get() = this[size - 2]
