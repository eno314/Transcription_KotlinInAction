package nine

interface Comparator<in T> {
    // Tをinポジションで使用
    fun compare(e1: T, e2: T): Int
}
