package seven

fun main(args: Array<String>) {
    var point = Point(1, 2)
    point += Point(3, 4)

    println(point)
}

operator fun Char.times(count: Int): String {
    return toString().repeat(count)
}
