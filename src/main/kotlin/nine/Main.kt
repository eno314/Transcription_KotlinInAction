package nine

fun main(args: Array<String>) {
    println(listOf(1, 2, 3, 4).penultimate)
}

// このジェネリック拡張プロパティは任意のリストで呼び出し可能
val <T> List<T>.penultimate: T
    get() = this[size - 2]
