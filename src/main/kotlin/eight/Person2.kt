package eight

data class Person2(val name: String, val age: Int)

val people = listOf(Person2("Alice", 29), Person2("Bob", 31))

fun lookForAlice(people: List<Person2>) {
    // ラムダ式にラベルを付ける
    people.forEach label@ {
        if (it.name == "Alice") {
            // return@labelはこのラベルを参照する
            return@label
        }
    }
    // この行は常に出力される
    println("Alice might be somewhere")
}
