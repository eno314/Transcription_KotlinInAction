package eight

data class Person2(val name: String, val age: Int)

val people = listOf(Person2("Alice", 29), Person2("Bob", 31))

fun lookForAlice(people: List<Person2>) {
    people.forEach {
        if (it.name == "Alice") {
            println("Found!")
            // for文と同じように関数からreturn
            return
        }
    }
    println("Alice is not found")
}
