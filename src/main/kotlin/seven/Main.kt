package seven

import java.math.BigDecimal
import java.time.LocalDate

fun main(args: Array<String>) {
    val now = LocalDate.now()
    // 現在から10日間のレンジを作る
    val vacation = now..now.plusDays(10)
    // 指定した日付がレンジに含まれるかを検証する
    println(now.plusWeeks(1) in vacation)
}

operator fun Char.times(count: Int): String {
    return toString().repeat(count)
}

operator fun BigDecimal.inc() = this + BigDecimal.ONE
