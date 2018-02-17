package eleven

import kotlinx.html.*

open class Tag(val name: String) {
    // すべてのネストされたタグのリストを持つ
    private val children = mutableListOf<Tag>()

    protected fun <T : Tag> doInit(child: T, init: T.() -> Unit) {
        // 子タグを初期化する
        child.init()
        // 子タグへの参照を格納する
        children.add(child)
    }

    // 結果をHTMLの文字列として返す
    override fun toString() = "<$name>${children.joinToString("")}</$name>"
}

fun table(init: TABLE.() -> Unit) = TABLE().apply(init)

class TABLE : Tag("table") {
    // TRタグの新しいインスタンスを生成し、初期化し、TABLEタグの子として追加する
    fun tr(init: TR.() -> Unit) = doInit(TR(), init)
}

class TR : Tag("tr") {
    // TDタグの新しいインスタンスを、TRタグの子として追加する
    fun td(init: TD.() -> Unit) = doInit(TD(), init)
}

class TD : Tag("td")

fun createTable() =
        table {
            tr {
                td {
                }
            }
        }

fun createAnotherTable() = table {
    for (i in 1..2) {
        // trを呼び出すたびに新しいTRタグが生成され、TABLEの子として追加される
        tr {
            td {
            }
        }
    }
}

fun UL.item(href: String, name: String) = li { a(href) { +name } }

fun UL.divider() = li {
    role = "separator"; classes = setOf("divider")
}

fun UL.dropdownHeader(text: String) = li {
    classes = setOf("dropdown-header"); +text
}

fun DIV.dropdownMenu(block: UL.() -> Unit) = ul("dropdown-menu", block)
