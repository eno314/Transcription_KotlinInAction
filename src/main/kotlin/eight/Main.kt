package eight

fun main(args: Array<String>) {
    // Intの型の引数を2つとり、Intの型を返す関数
    val sum: (Int, Int) -> Int = { x, y -> x + y }
    // 引数を取らず、戻り値もない関数
    val action: () -> Unit = { println(42) }

    var canReturnNull: (Int, Int) -> Int? = { x, y -> null }
}
