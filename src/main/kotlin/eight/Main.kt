package eight

fun main(args: Array<String>) {
    twoAndTree { a, b -> a + b }
    twoAndTree { a, b -> a * b }
}

// 関数型の引数宣言
fun twoAndTree(operation: (Int, Int) -> Int) {
    val result = operation(2, 3)
    println("The result is $result")
}

fun performRequest(
        url: String,
        // 関数型は名前付きの引数を持っている
        callback: (code: Int, content: String) -> Unit
) {
    /*...*/
}
