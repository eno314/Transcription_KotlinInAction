package eight

fun main(args: Array<String>) {
    val url = "http://kotl.in"
    // APIで提供されている名前をラムダの引数名として使用可能
    performRequest(url) { code, content ->
        /* ... */
    }
    // また、それらは変更可能
    performRequest(url) { code, page ->
        /* ... */
    }
}

fun performRequest(
        url: String,
        // 関数型は名前付きの引数を持っている
        callback: (code: Int, content: String) -> Unit
) {
    /*...*/
}
