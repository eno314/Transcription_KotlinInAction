package seven

fun main(args: Array<String>) {
    val numbers = ArrayList<Int>()
    numbers += 42
    println(numbers[0])
}

operator fun Char.times(count: Int): String {
    return toString().repeat(count)
}
