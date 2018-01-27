package seven

fun main(args: Array<String>) {
    val p = Point(10, 20)
    println(-p)
}

operator fun Char.times(count: Int): String {
    return toString().repeat(count)
}
