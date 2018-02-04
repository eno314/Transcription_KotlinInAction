package nine

open class Animal {
    fun feed() {
        // ...
    }
}

// このパラメータは共変として宣言されていない
class Herd<T : Animal> {
    val size: Int
        get() = 0 // ...

    operator fun get(i: Int): T {
        // ...
    }
}

fun feedAll(animals: Herd<Animal>) {
    for (i in 0 until animals.size) {
        animals[i].feed()
    }
}
