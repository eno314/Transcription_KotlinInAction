package eleven

fun main(args: Array<String>) {
    val stringBuilder = StringBuilder("Hi")
    // appendExclを拡張関数として呼び出すことができる　
    stringBuilder.appendExcl()
    println(stringBuilder)
}

// appendExclは拡張関数型の変数
val appendExcl: StringBuilder.() -> Unit = { append("!") }

// 標準ライブラリのbuildString
fun buildString(builderAction: StringBuilder.() -> Unit) =
        StringBuilder().apply(builderAction).toString()
