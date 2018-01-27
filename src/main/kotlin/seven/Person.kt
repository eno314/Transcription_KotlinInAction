package seven

class Person(val firstName: String, val lastName: String) : Comparable<Person> {
    override fun compareTo(other: Person): Int {
        // 与えられたコールバックを順番に評価し、値を比較
        return compareValuesBy(this, other, Person::lastName, Person::firstName)
    }
}
