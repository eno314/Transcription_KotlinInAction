package nine

import java.util.*
import javax.xml.ws.Service

fun main(args: Array<String>) {
    val serviceImpl = loadService<Service>()
}

/*
// 型パラメータがreifiedとマークされている
inline fun <reified T : Activity> Context.startActivity() {
    // T::classとして型パラメータのクラスにアクセス
    val intent = Intent(this, T::class.java)
    startActivity(intent)
}

// アクティビティを表示するメソッドの呼び出し
startActivity<DetailActivity>()
*/

// 型パラメータがreifiedとマークされている
inline fun <reified T> loadService() =
        // T::classとして型パラメータのクラスにアクセス
        ServiceLoader.load(T::class.java)

// reifiedは型パラメータが実行時に消去されないことを宣言している
inline fun <reified T>
        Iterable<*>.filterIsIntance(): List<T> {
    val destination = mutableListOf<T>()
    for (element in this) {
        // 要素が型引数として指定されたクラスのインスタンスであるかどうかを確認できる
        if (element is T) {
            destination.add(element)
        }
    }
    return destination
}

// このコードはコンパイルされる
inline fun <reified T> isA(value: Any) = value is T

fun printSum(c: Collection<Int>) {
    // このチェックは妥当
    if (c is List<Int>) {
        println(c.sum())
    }
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
