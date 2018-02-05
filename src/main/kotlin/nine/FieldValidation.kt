package nine

// Tについての反変として宣言されたインタフェース
interface FieldValidation<in T> {
    // Tはinポジションのみで使用される
    // このメソッドはTの値を消費する
    fun validate(input: T): Boolean
}

object DefaultStringValidator : FieldValidation<String> {
    override fun validate(input: String) = input.isNotEmpty()
}

object DefaultIntValidator : FieldValidation<Int> {
    override fun validate(input: Int) = input >= 0
}


