package seven

fun main(args: Array<String>) {
    println('a' * 3)
}

operator fun Char.times(count: Int): String {
    return toString().repeat(count)
}
