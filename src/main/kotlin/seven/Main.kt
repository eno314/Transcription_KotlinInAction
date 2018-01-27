package seven

import java.math.BigDecimal

fun main(args: Array<String>) {
    for (c in "abc") {
        println(c)
    }
}

operator fun Char.times(count: Int): String {
    return toString().repeat(count)
}

operator fun BigDecimal.inc() = this + BigDecimal.ONE

// このライブラリ関数は、文字列を繰り返し処理できる
// operator fun CharSequence.iterator(): CharIterator
