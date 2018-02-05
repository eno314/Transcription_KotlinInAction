package nine

open class Animal {
    fun feed() {
        // ...
    }
}

/*
// Tパラメータは共変
class Herd<out T : Animal> {
    val size: Int
        get() = 0 // ...

    // 戻り値の型としてTを使用
    operator fun get(i: Int): T {
        // ...
    }
}
*/

/*
fun feedAll(animals: Herd<Animal>) {
    for (i in 0 until animals.size) {
        animals[i].feed()
    }
}

// CatはAnimalである
class Cat : Animal() {
    fun cleanLitter() {
        //..
    }
}

fun takeCareOfCats(cats: Herd<Cat>) {
    for (i in 0 until cats.size) {
        cats[i].cleanLitter()
    }
    // キャストは不要
    feedAll(cats)
}
*/
