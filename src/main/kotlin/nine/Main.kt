package nine

fun main(args: Array<String>) {
    // val nullableStringProcessor = Processor<String?>()
    // nullableStringProcessor.process(null)
    // Error : Type argument is not within its bounds: should be subtype of 'Any'
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
