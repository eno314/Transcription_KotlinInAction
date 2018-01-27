package seven

import java.math.BigDecimal

fun main(args: Array<String>) {
    println("abc" < "bac")
}

operator fun Char.times(count: Int): String {
    return toString().repeat(count)
}

operator fun BigDecimal.inc() = this + BigDecimal.ONE
