package nine

// null非許容型上限境界の指定
class Processor<T : Any> {
    fun process(value: T) {
        // 型Tのvalueは、この時点ではnull非許容である
        value.hashCode()
    }
}
