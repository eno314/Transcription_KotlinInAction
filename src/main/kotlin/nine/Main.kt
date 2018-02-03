package nine

fun main(args: Array<String>) {
    printSum(listOf(1, 2, 3))
}

fun printSum(c: Collection<*>) {
    // as? List<Int> で警告。Unchecked cast: List<*> to List<Int>
    val intList = c as? List<Int> ?: throw IllegalArgumentException("List is expected")
    println(intList.sum())
}

fun <T> ensureTrailingPeriod(seq: T)
        // 型パラメータ制約のリスト
        where T : CharSequence, T : Appendable {
    // CharSequenceインタフェースに対して定義された拡張関数の呼び出し
    if (!seq.endsWith('.')) {
        // Appendableインタフェースのメソッド呼び出し
        seq.append('.')
    }
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
