package nine

fun main(args: Array<String>) {
    val readers: MutableList<String> = mutableListOf()
    val resders2 = mutableListOf<String>()
}

// 先頭の<T>は型パラメータの宣言
// ここでは型パラメータはレシーバと戻り値の型で使用される
fun <T> List<T>.slice(indices: IntRange): List<T> {
    // ...
    return listOf()
}
