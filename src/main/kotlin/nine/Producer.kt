package nine

// このクラスはTについて共変だと宣言されている
interface Producer<out T> {
    fun produce(): T
}
