package nine

fun main(args: Array<String>) {
    println(listOf(1, 2, 3).sum())
}

// このジェネリック拡張プロパティは任意のリストで呼び出し可能
val <T> List<T>.penultimate: T
    get() = this[size - 2]
