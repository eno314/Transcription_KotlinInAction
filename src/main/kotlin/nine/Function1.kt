package nine

interface Function1<in P, out R> {
    operator fun invoke(p: P): R
}
