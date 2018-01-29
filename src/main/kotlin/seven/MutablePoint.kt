package seven

data class MutablePoint(var x: Int, var y: Int)

// setと名付けられた演算子関数を定義
operator fun MutablePoint.set(index: Int, value: Int) {
    when (index) {
    // 指定されたindexの座標を変更する
        0 -> x = value
        1 -> y = value
        else -> throw IndexOutOfBoundsException("Invalid coordinate $index")
    }
}
