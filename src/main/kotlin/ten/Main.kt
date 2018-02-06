package ten

var counter = 0

fun main(args: Array<String>) {
    val kProperty = ::counter
    // リフレクションを使ってsetterを呼び出し、引数として21を渡す
    kProperty.set(21)
    // getを呼び出してプロパティの値を取得する
    println(kProperty.get())
}

fun sum(x: Int, y: Int) = x + y

fun foo(x: Int) = println(x)

@Deprecated("Use removeAt(index) instead.", ReplaceWith("removeAt(index)"))
fun remove(index: Int) {
    // ...
}

fun removeAt(index: Int) {
    // ...
}
