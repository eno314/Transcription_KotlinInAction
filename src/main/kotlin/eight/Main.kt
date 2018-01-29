package eight

fun main(args: Array<String>) {
    val letters = listOf("Alpha", "Beta")
    // デフォルトの変換関数を使用
    println(letters.joinToString())
    // ラムダを引数として渡す
    println(letters.joinToString { it.toLowerCase() })
    // ラムダを含むいくつかの引数を渡すために、名前付き引数構文を使用する
    println(letters.joinToString(
            separator = "! ", postfix = "! ", transform = { it.toUpperCase() }
    ))
}

fun <T> Collection<T>.joinToString(
        separator: String = ", ",
        prefix: String = "",
        postfix: String = "",
        // ラムダをデフォルト値とする関数型引数を宣言する
        transform: ((T) -> String)? = null
): String {
    val result = StringBuilder(prefix)
    for ((index, element) in this.withIndex()) {
        if (index > 0) {
            result.append(separator)
        }
        // 関数呼び出しに安全呼び出し構文を使う
        // コールバックが指定されていない場合を扱うために、エルビス演算子を使う
        val str = transform?.invoke(element) ?: element.toString()
        result.append(str)
    }
    result.append(postfix)
    return result.toString()
}

fun String.filter(predicate: (Char) -> Boolean): String {
    val sb = StringBuilder()
    for (index in 0 until length) {
        val element = get(index)
        if (predicate(element)) {
            sb.append(element)
        }
    }
    return sb.toString()
}

fun processTheAnswer(f: (Int) -> Int) {
    println(f(42))
}

// 関数型の引数宣言
fun twoAndTree(operation: (Int, Int) -> Int) {
    val result = operation(2, 3)
    println("The result is $result")
}

fun performRequest(
        url: String,
        // 関数型は名前付きの引数を持っている
        callback: (code: Int, content: String) -> Unit
) {
    /*...*/
}
