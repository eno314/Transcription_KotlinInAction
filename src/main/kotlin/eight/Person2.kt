package eight

data class Person2(val name: String, val age: Int)

val people = listOf(Person2("Alice", 29), Person2("Bob", 31))

fun lookForAlice(people: List<Person2>) {
    // ラムダの代わりに無名関数を使用する
    people.forEach(fun(person) {
        if (person.name == "Alice") {
            // 最も近い関数（ここでは無名関数）を参照する
            return
        }
        println("${person.name} is not Alice")
    })
}
