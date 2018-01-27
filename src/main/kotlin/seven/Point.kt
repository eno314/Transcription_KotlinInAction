package seven

class Point(val x: Int, val y: Int) {
    // Anyに定義されているequalsメソッドをオーバーライド
    override fun equals(obj: Any?): Boolean {
        // 最適化 : 引数がthisと同じオブジェクトかどうかを検証
        if (obj === this) return true
        // 引数の型を検証
        if (obj !is Point) return false
        // スマートキャストを使って、Pointのxとyのプロパティにアクセス
        return obj.x == x && obj.y == y
    }
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
