package seven

data class Point(val x: Int, val y: Int)

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
