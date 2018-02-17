package eleven

import kotlinx.html.*
import kotlinx.html.stream.createHTML

fun main(args: Array<String>) {
    val html = createHTML().ul {
        classes = setOf("dropdown-menu")
        // liの代わりにitem関数を利用可能
        item("#", "Action")
        item("#", "Another action")
        divider()
        dropdownHeader("Header")
        item("#", "Separated link")
    }

    println(html)
}

/*
fun dropdownExample() = createHTML().dropdown {
    dropdownButton { +"Dropdown" }
    dropdownMenu {
        item("#", "Action")
        item("#", "Another action")
        divider()
        dropdownHeader("Header")
        item("#", "Separated link")
    }
}
*/

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
