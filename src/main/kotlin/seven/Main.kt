package seven

import java.math.BigDecimal

fun main(args: Array<String>) {
    val mutableMap = mutableMapOf("hoge" to "fuga")
    val key = "hoge"
    val newValue = "piyo"
    mutableMap[key] = newValue
    println(mutableMap)
}

operator fun Char.times(count: Int): String {
    return toString().repeat(count)
}

operator fun BigDecimal.inc() = this + BigDecimal.ONE
