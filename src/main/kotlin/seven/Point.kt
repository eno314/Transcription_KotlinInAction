package seven

data class Point(val x: Int, val y: Int) {

    // plusという名前の演算子関数を定義する
    operator fun plus(other: Point): Point {
        // 座標を足し合わせて、新しいPointオブジェクトを返す
        return Point(x + other.x, y + other.y)
    }
}
