package eight

import java.io.BufferedReader
import java.io.FileReader
import java.util.concurrent.locks.Lock

fun main(args: Array<String>) {
    lookForAlice(people)
}

fun readFirstLineFromFile(path: String): String {
    // BufferedReaderを作成し、use関数を呼び出し、ファイルに対して操作を実行するためのラムダを渡す
    BufferedReader(FileReader(path)).use { br ->
        // 行を関数から返す
        return br.readLine()
    }
}

inline fun foo(inlined: () -> Unit, noinline notInlined: () -> Unit) {
    // ...
}

/*
fun <T, R> Sequence<T>.map(transform: (T) -> R): Sequence<R> {
    return TransformingSequence(this, transform)
}
*/

class LockOwner(val lock: Lock) {
    fun runUnderLock(body: () -> Unit) {
        // 関数型の変数は引数として渡される。ラムダではない
        synchronized(lock, body)
    }
}

fun foo(l: Lock) {
    println("Before sync")
    synchronized(l) {
        println("Action")
    }
    println("After sync")
}

inline fun <T> synchronized(lock: Lock, action: () -> T): T {
    lock.lock()
    try {
        return action()
    } finally {
        lock.unlock()
    }
}

fun <T> Collection<T>.joinToString(
        separator: String = ", ",
        prefix: String = "",
        postfix: String = "",
        // ラムダをデフォルト値とする関数型引数を宣言する
        transform: ((T) -> String)? = null
): String {
    val result = StringBuilder(prefix)
    for ((index, element) in this.withIndex()) {
        if (index > 0) {
            result.append(separator)
        }
        // 関数呼び出しに安全呼び出し構文を使う
        // コールバックが指定されていない場合を扱うために、エルビス演算子を使う
        val str = transform?.invoke(element) ?: element.toString()
        result.append(str)
    }
    result.append(postfix)
    return result.toString()
}

fun String.filter(predicate: (Char) -> Boolean): String {
    val sb = StringBuilder()
    for (index in 0 until length) {
        val element = get(index)
        if (predicate(element)) {
            sb.append(element)
        }
    }
    return sb.toString()
}

fun processTheAnswer(f: (Int) -> Int) {
    println(f(42))
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
