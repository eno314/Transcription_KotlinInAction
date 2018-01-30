package eight

enum class Delivery { STANDARD, EXPEDITED }

class Order(val itemCount: Int)

fun getShippingCostCalculator(delivery: Delivery)
        // 関数を返す関数の宣言
        : (Order) -> Double {
    if (delivery == Delivery.EXPEDITED) {
        // 関数からラムダを返す
        return { order -> 6 + 2.1 * order.itemCount }
    }
    // 関数からラムダを返す
    return { order -> 1.2 * order.itemCount }
}
