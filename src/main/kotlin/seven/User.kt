package seven
/*
import kotlin.reflect.KProperty

object Users : IdTable() {
    val name: Column<String> = varchar("name", lenght = 50).index()
    val age: Column<Int> = integer("age")
}

// Userのそれぞれのインスタンスはテーブルの特定のエントリに対応
class User(id: EntityID) : Entity(id) {
    // Users.nameは、nameプロパティの委譲オブジェクト
    var name: String by Users.name
    var age: Int by Users.age
}

operator fun <T> Column<T>.getValue(o: Entity, desc: KProperty<*>): T {
    // データベースから値を取り出す
}

operator fun <T> Column<T>.setValue(o: Entity, desc: KProperty<*>, value: T) {
    // データベースの値を更新する
}
*/
