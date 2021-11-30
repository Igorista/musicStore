fun main(args: Array<String>) {
    val unit: Char = '\u20bd'
    val orderSum : Int
    val previousOrder: Int = 10001
    val order: Int = 1001
    val regularСustomer: Boolean = true
    val discountFirst: Int = 100
    val discountSecond: Int = order * 5 / 100
    //val discountRegular : Int = discountSecond * 1 / 100
    if (regularСustomer) {
        if (previousOrder < 1001) {
            orderSum = order - order / 100
            println("Стоимость заказа составила $orderSum $unit")
        } else if (previousOrder >= 1001 && previousOrder <= 10000) {
            orderSum = order - discountFirst - ((order - discountFirst) / 100)
            println("Стоимость заказа составила $orderSum $unit")
        } else if (previousOrder >= 10001) {
            orderSum = order - discountSecond - ((order - discountSecond) / 100)
            println("Стоимость заказа составила $orderSum $unit")
        }
    } else {
        if (previousOrder < 1001) {
            orderSum = order
            println("Стоимость заказа составила $orderSum $unit")
        } else if (previousOrder >= 1001 && previousOrder <= 10000) {
            orderSum = order - discountFirst
            println("Стоимость заказа составила $orderSum $unit")
        } else if (previousOrder >= 10001) {
            orderSum = order - discountSecond
            println("Стоимость заказа составила $orderSum $unit")
        }
    }
}