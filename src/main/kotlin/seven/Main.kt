package seven

fun main(args: Array<String>) {
    val list = arrayListOf(1, 2)
    // += はlistを変更する
    list += 3

    // + は全ての要素を持った新しいリストを返す
    val newList = list + listOf(4, 5)

    println(list)
    println(newList)
}

operator fun Char.times(count: Int): String {
    return toString().repeat(count)
}
