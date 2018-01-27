package seven

import java.math.BigDecimal

fun main(args: Array<String>) {
    val p = Point(10, 20)
    println(p[1])
}

operator fun Char.times(count: Int): String {
    return toString().repeat(count)
}

operator fun BigDecimal.inc() = this + BigDecimal.ONE
