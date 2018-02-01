package nine

fun main(args: Array<String>) {
    println(listOf(1, 2, 3, 4).penultimate)
}

class Hoge {
    val <T> x: T = TODO()
    // Error: Type parameter of a property must be used in its receiver type
}

// このジェネリック拡張プロパティは任意のリストで呼び出し可能
val <T> List<T>.penultimate: T
    get() = this[size - 2]
