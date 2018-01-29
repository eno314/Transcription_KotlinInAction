package seven

/*
// オブジェクトはテーブルに対応
object Users : IdTable() {
    // プロパティはテーブルのカラムに対応
    val name = varchar("name", lenght = 50).index()
    val age = integer("age")
}

// Userのそれぞれのインスタンスはテーブルの特定のエントリに対応
class User(id: EntityID) : Entity(id) {
    // nameの値はデータベースに格納されているユーザーに対する値
    var name: Strin by Users.name
    var age: Int by Users.age
}
*/
