package seven

import java.math.BigDecimal

fun main(args: Array<String>) {
    var bd = BigDecimal.ZERO
    // 1つめのprintlnが実行された後でインクリメントする
    println(bd++)

    // 2つめのprintlnが実行される前にインクリメントする
    println(++bd)
}

operator fun Char.times(count: Int): String {
    return toString().repeat(count)
}

operator fun BigDecimal.inc() = this + BigDecimal.ONE
