package eight

fun main(args: Array<String>) {
    // predicateに引数としてラムダを渡す
    println("ab1c".filter { it in 'a'..'z' })
}

fun <T> Collection<T>.joinToString(
        separator: String = ", ",
        prefix: String = "",
        postfix: String = ""
): String {
    val result = StringBuilder(prefix)
    for ((index, element) in this.withIndex()) {
        if (index > 0) {
            result.append(separator)
        }
        // デフォルトのtoStringメソッドを使ってオブジェクトをStringへ変換
        result.append(element)
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
