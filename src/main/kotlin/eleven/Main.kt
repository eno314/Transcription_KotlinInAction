package eleven

import kotlinx.html.stream.createHTML
import kotlinx.html.table
import kotlinx.html.td
import kotlinx.html.tr

fun main(args: Array<String>) {
    println(createSimpleTable())
}

fun createSimpleTable() = createHTML()
        .table {
            tr {
                td { +"cell" }
            }
        }

// appendExclは拡張関数型の変数
val appendExcl: StringBuilder.() -> Unit = { append("!") }

// 標準ライブラリのbuildString
fun buildString(builderAction: StringBuilder.() -> Unit) =
        StringBuilder().apply(builderAction).toString()
