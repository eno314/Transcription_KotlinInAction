package eleven

fun main(args: Array<String>) {
    val s = buildString {
        // StringBuilderインスタンスへの参照としてitを使用する
        it.append("Hello, ")
        it.append("World!")
    }
    println(s)
}

// 関数型の引数を宣言
fun buildString(builderAction: (StringBuilder) -> Unit): String {
    val sb = StringBuilder()
    // StringBuilderをラムダの引数として渡す
    builderAction(sb)
    return sb.toString()
}