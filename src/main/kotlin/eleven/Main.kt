package eleven

import kotlinx.html.*
import kotlinx.html.stream.createHTML

fun main(args: Array<String>) {
    val bavarianGreeter = Greeter("Servus")
    // Greeterインスタンスを関数のように呼び出す
    bavarianGreeter("Dmitry")
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
