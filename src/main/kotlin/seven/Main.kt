package seven

import java.math.BigDecimal

fun main(args: Array<String>) {
    val n = 9
    // 0..n + 1と書けるが、括弧がある方が明確
    println(0..(n + 1))
}

operator fun Char.times(count: Int): String {
    return toString().repeat(count)
}

operator fun BigDecimal.inc() = this + BigDecimal.ONE
