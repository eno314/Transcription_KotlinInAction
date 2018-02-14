package eleven

fun main(args: Array<String>) {
    val s = buildString {
        // thisキーワードはStringBuilderインスタンスを参照している
        this.append("Hello, ")
        // thisをなくしてStringBuilderへ暗黙的に参照している
        append("World!")
    }
    println(s)
}

// レシーバ付き関数型の型の引数を宣言
fun buildString(builderAction: StringBuilder.() -> Unit): String {
    val sb = StringBuilder()
    // StringBuilderをラムダの引数として渡す
    builderAction(sb)
    return sb.toString()
}