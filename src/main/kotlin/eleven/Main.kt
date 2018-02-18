package eleven

import kotlinx.html.*
import kotlinx.html.stream.createHTML
import org.jetbrains.exposed.sql.select
import org.jetbrains.exposed.sql.selectAll
import java.time.LocalDate
import java.time.Period

fun main(args: Array<String>) {
    val result = (Country innerJoin Customer)
            .select { Country.name eq "USA" }
    result.forEach { println(it[Customer.name]) }
}

val Int.days: Period
        // thisは数値の定数を参照している
    get() = Period.ofDays(this)

val Period.ago: LocalDate
        // 演算子構文をつかってLocalDate.minusを呼び出す
    get() = LocalDate.now() - this

val Period.fromNow: LocalDate
        // 演算子構文を使ってLocalDate.plusを呼び出す
    get() = LocalDate.now() + this

infix fun <T> T.should(matcher: Matcher<T>) = matcher.test(this)

interface Matcher<T> {
    fun test(value: T)
}

class startWith(val prefix: String) : Matcher<String> {
    override fun test(value: String) {
        if (!value.startsWith(prefix)) {
            throw AssertionError("String $value does not start with $prefix")
        }
    }
}

fun buildDropdown() = createHTML().div(classes = "dropdown") {
    button(classes = "btn dropdown-toggle") {
        +"Dropdown"
        span(classes = "caret")
    }
    ul(classes = "dropdown-menu") {
        li { a("#") { +"Action" } }
        li { a("#") { +"Another action" } }
        li { role = "separator"; classes = setOf("divider") }
        li { classes = setOf("dropdown-header"); +"Header" }
        li { a("#") { +"Separated link" } }
    }
}

fun createSimpleTable() = createHTML()
        .table {
            // this@tableはTABLE型
            (this@table).tr {
                // this@trはTR型
                (this@tr).td {
                    // ここでTD型の暗黙的なレシーバであるthis@tdを使える
                    +"cell"
                }
            }
        }

// appendExclは拡張関数型の変数
val appendExcl: StringBuilder.() -> Unit = { append("!") }

// 標準ライブラリのbuildString
fun buildString(builderAction: StringBuilder.() -> Unit) =
        StringBuilder().apply(builderAction).toString()
