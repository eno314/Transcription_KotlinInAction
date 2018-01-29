package seven

class Point(val x: Int, val y: Int) {
    operator fun component1() = x
    operator fun component2() = y
}

operator fun Point.plus(other: Point): Point {
    return Point(x + other.x, y + other.y)
}

operator fun Point.times(scale: Double): Point {
    return Point((x * scale).toInt(), (y * scale).toInt())
}

// 単項演算子のマイナス関数は引数を持たない
operator fun Point.unaryMinus(): Point {
    // 点の座標の符号を反転して返す
    return Point(-x, -y)
}

// getと名付けられた演算子関数を定義する
operator fun Point.get(index: Int): Int {
    return when (index) {
    // indexに対応した座標を取得する
        0 -> x
        1 -> y
        else -> throw IndexOutOfBoundsException("Invalid coordinate $index")
    }
}
