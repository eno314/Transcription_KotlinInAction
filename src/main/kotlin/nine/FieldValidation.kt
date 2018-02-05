package nine

import kotlin.reflect.KClass

// Tについての反変として宣言されたインタフェース
interface FieldValidator<in T> {
    // Tはinポジションのみで使用される
    // このメソッドはTの値を消費する
    fun validate(input: T): Boolean
}

object DefaultStringValidator : FieldValidator<String> {
    override fun validate(input: String) = input.isNotEmpty()
}

object DefaultIntValidator : FieldValidator<Int> {
    override fun validate(input: Int) = input >= 0
}

object Validators {
    // 以前と同じマップを使うが、今回は外部からアクセスできない
    private val validators = mutableMapOf<KClass<*>, FieldValidator<*>>()

    fun <T : Any> registerValidator(kClass: KClass<T>, fieldValidator: FieldValidator<T>) {
        // バリデータクラスと対応するとき、正しいキー・バリューペアのみをマップに入れる
        validators[kClass] = fieldValidator
    }

    // FieldValidator<T>へのチェックされないキャストに関する警告を抑える
    @Suppress("UNCHECKED_CAST")
    operator fun <T : Any> get(kClass: KClass<T>): FieldValidator<T> {
        return validators[kClass] as? FieldValidator<T>
                ?: throw IllegalArgumentException("No validator for ${kClass.simpleName}")
    }
}
