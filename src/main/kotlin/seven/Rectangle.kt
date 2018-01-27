package seven

data class Rectangle(val upperLeft: Point, val lowerRight: Point)

operator fun Rectangle.contains(p: Point): Boolean {
    // レンジを構築し、x座標がそのレンジに属するかを検証
    return p.x in upperLeft.x until lowerRight.x
            // until関数を使って開いたレンジを構築する
            && p.y in upperLeft.y until lowerRight.y
}
