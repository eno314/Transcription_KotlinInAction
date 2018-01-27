package seven

import java.math.BigDecimal

fun main(args: Array<String>) {
    val map = mapOf("hoge" to "fuga")
    val key = "hoge"
    val value = map[key]
    println(value)
}

operator fun Char.times(count: Int): String {
    return toString().repeat(count)
}

operator fun BigDecimal.inc() = this + BigDecimal.ONE
