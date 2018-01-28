package seven

// 値を保持するデータクラスを宣言する
data class NameComponents(val name: String, val extension: String)

fun splitFilename(fullName: String): NameComponents {
    // 関数の戻り値をデータクラスのインスタンスとする
    val result = fullName.split('.', limit = 2)
    // クラスの中身を取り出すために分解宣言構文を利用
    return NameComponents(result[0], result[1])
}
