package nine

fun main(args: Array<String>) {
    val letters = ('a'..'z').toList()
    // 型引数の明示的な指定
    println(letters.slice<Char>(0..2))
    // 「TはCharである」とコンパイラが推論する
    println(letters.slice(10..13))
}
