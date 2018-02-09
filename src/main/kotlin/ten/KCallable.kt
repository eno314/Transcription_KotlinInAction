package ten

interface KCallable<out R> {
    fun call(vararg args: Any?): R
    // ...
}
