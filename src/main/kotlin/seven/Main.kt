package seven

import java.math.BigDecimal

fun main(args: Array<String>) {
    val p = MutablePoint(10, 20)
    p[1] = 42
    println(p)
}

operator fun Char.times(count: Int): String {
    return toString().repeat(count)
}

operator fun BigDecimal.inc() = this + BigDecimal.ONE
