package seven

import java.math.BigDecimal

fun main(args: Array<String>) {
    val n = 9
    // レンジからメソッドを呼び出す場合は丸括弧で囲む
    (0..n).forEach { print(it) }
}

operator fun Char.times(count: Int): String {
    return toString().repeat(count)
}

operator fun BigDecimal.inc() = this + BigDecimal.ONE
