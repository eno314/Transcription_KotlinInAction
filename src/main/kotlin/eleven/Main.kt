package eleven

import kotlinx.html.*
import kotlinx.html.stream.createHTML

fun main(args: Array<String>) {
    val i1 = Issue("IDEA-154446", "IDEA", "Bug", "Major",
            "Save setting failed")
    val i2 = Issue("KT-12183", "Kotlin", "Feature", "Normal",
            "Intention: convert several calls on the same receiver to with/apply")
    val predicate = ImportantIssuesPredicate("IDEA")

    // predicateをfilterに渡す
    for (issue in listOf(i1, i2).filter(predicate)) {
        println(issue.id)
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
