package seven

import java.math.BigDecimal
import java.time.LocalDate

fun main(args: Array<String>) {
    val newYear = LocalDate.ofYearDay(2017, 1)
    val daysOff = newYear.minusDays(1)..newYear
    // 対応するiterator関数が利用できるので、daysOff上で繰り返し処理を行う
    for (dayOff in daysOff) {
        println(dayOff)
    }
}

operator fun Char.times(count: Int): String {
    return toString().repeat(count)
}

operator fun BigDecimal.inc() = this + BigDecimal.ONE

operator fun ClosedRange<LocalDate>.iterator(): Iterator<LocalDate> =
        // このオブジェクトは、LocalDate要素を繰り返すIteratorを実装する
        object : Iterator<LocalDate> {
            var current = start

            // 日付に対して使用されるcompareToの規約に注意
            override fun hasNext() = current <= endInclusive

            // 変更する前に、現在の日付を結果として返す
            override fun next() = current.apply {
                // 現在の日付を1日インクリメントする
                current = plusDays(1)
            }
        }
