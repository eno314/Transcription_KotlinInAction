package eleven

fun main(args: Array<String>) {
    val stringBuilder = StringBuilder("Hi")
    // appendExclを拡張関数として呼び出すことができる　
    stringBuilder.appendExcl()
    println(stringBuilder)
}

// appendExclは拡張関数型の変数
val appendExcl : StringBuilder.() -> Unit = { append("!") }

// レシーバ付き関数型の型の引数を宣言
fun buildString(builderAction: StringBuilder.() -> Unit): String {
    val sb = StringBuilder()
    // StringBuilderをラムダの引数として渡す
    builderAction(sb)
    return sb.toString()
}