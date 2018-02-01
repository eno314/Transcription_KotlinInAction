package nine

fun main(args: Array<String>) {
    // この呼び出しでは、型パラメータTはIntであると推論される
    println(listOf(1, 2, 3, 4).penultimate)
}

// このジェネリック拡張プロパティは任意のリストで呼び出し可能
val <T> List<T>.penultimate: T
    get() = this[size - 2]
