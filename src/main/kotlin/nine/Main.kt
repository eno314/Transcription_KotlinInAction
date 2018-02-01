package nine

fun main(args: Array<String>) {
    // 文字列はアルファベット順に比較可能
    println(max("kotlin", "java"))
}

// この関数の引数は比較可能な要素でなければならない
fun <T : Comparable<T>> max(first: T, second: T): T {
    return if (first > second) first else second
}

// 型パラメータの上限境界としてNumberを指定
fun <T : Number> oneHalf(value: T): Double {
    // Nubmerクラスで定義されているメソッドの呼び出し
    return value.toDouble() / 2.0
}

// このジェネリック拡張プロパティは任意のリストで呼び出し可能
val <T> List<T>.penultimate: T
    get() = this[size - 2]
