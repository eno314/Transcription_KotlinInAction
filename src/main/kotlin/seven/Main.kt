package seven

import java.math.BigDecimal

fun main(args: Array<String>) {
    val p1 = Person("Alice", "Smith")
    val p2 = Person("Bob", "Johnson")
    println(p1 < p2)
}

operator fun Char.times(count: Int): String {
    return toString().repeat(count)
}

operator fun BigDecimal.inc() = this + BigDecimal.ONE
