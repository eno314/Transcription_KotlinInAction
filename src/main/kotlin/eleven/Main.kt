package eleven

fun main(args: Array<String>) {
    val map = mutableMapOf(1 to "one")
    map.apply { this[2] = "two" }
    with(map) { this[3] = "three" }
    println(map)
}

// appendExclは拡張関数型の変数
val appendExcl: StringBuilder.() -> Unit = { append("!") }

// 標準ライブラリのbuildString
fun buildString(builderAction: StringBuilder.() -> Unit) =
        StringBuilder().apply(builderAction).toString()
