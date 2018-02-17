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
